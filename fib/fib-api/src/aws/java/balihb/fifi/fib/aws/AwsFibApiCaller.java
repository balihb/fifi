package balihb.fifi.fib.aws;

import org.springframework.stereotype.Service;

import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClient;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.fasterxml.jackson.databind.ObjectMapper;

import balihb.fifi.fib.FibApiCaller;
import balihb.fifi.fib.model.FibNum;

@Service
public class AwsFibApiCaller implements FibApiCaller {

    public FibNum getFibNum(FibNum fibNum) throws Exception {
         AwsFibApiCallerService fibService =
         LambdaInvokerFactory.builder().build(AwsFibApiCallerService.class);
         FibApiRequest fibInput = new FibApiRequest();
         fibInput.setNum(fibNum);
         return fibService.call(fibInput).getNum();
        // AWSLambda awsLambda = AWSLambdaClientBuilder.standard().build();
//        AWSLambda awsLambda = AWSLambdaClientBuilder.defaultClient();
//        
//        InvokeRequest invokeRequest = new InvokeRequest().withFunctionName("ServerlessFifi-Fib-WC5PJAKE255B")
//                .withPayload("{ \"num\": \"10\" }");
//        
//        InvokeResult invokeResult = awsLambda.invoke(invokeRequest);
//        ObjectMapper mapper = new ObjectMapper();
//        FibNum res = mapper.readValue(new String(invokeResult.getPayload().array(), "UTF-8"), FibApiResponse.class).getNum();
//        return res;
    }

    public interface AwsFibApiCallerService {
        @LambdaFunction(functionName = "ServerlessFifi-Fib-WC5PJAKE255B")
        FibApiResponse call(FibApiRequest input);
    }
}
