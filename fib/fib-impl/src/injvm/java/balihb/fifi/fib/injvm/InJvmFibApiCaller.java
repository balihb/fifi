package balihb.fifi.fib.injvm;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import balihb.fifi.fib.FibApiCaller;
import balihb.fifi.fib.impl.FibImpl;
import balihb.fifi.fib.model.FibNum;

@Service
public class InJvmFibApiCaller implements FibApiCaller {
    @Override
    public FibNum getFibNum(Long fibNum) {
        return new FibImpl().getFibNum(fibNum).getBody();
    }
}
