package balihb.fifi.fib.injvm;

import org.springframework.http.ResponseEntity;

import balihb.fifi.fib.FibApiCaller;
import balihb.fifi.fib.impl.FibImpl;
import balihb.fifi.fib.model.FibNum;

public class InJvmFibApiCaller implements FibApiCaller {
    @Override
    public ResponseEntity<FibNum> getFibNum(Long fibNum) {
        return new FibImpl().getFibNum(fibNum);
    }
}
