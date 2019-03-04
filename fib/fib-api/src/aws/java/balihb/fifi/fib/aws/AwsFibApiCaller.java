package balihb.fifi.fib.aws;

import org.springframework.stereotype.Service;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

import balihb.fifi.fib.FibApiCaller;
import balihb.fifi.fib.model.FibNum;

@Service
public class AwsFibApiCaller implements FibApiCaller {

    public FibNum getFibNum(Long fibNum) {
        AwsFibApiCallerService fibService = LambdaInvokerFactory.builder().build(AwsFibApiCallerService.class);
        FibApiRequest fibInput = new FibApiRequest();
        fibInput.setFibNum(fibNum);

        return fibService.call(fibInput).getFibNum();
    }

    public interface AwsFibApiCallerService {
        @LambdaFunction(functionName = "ServerlessFifi-Fib-WC5PJAKE255B")
        FibApiResponse call(FibApiRequest input);
    }
}
