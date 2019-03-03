package balihb.fifi.fib;

import org.springframework.http.ResponseEntity;

import balihb.fifi.fib.model.FibNum;

public interface FibApiCaller {
    public ResponseEntity<FibNum> getFibNum(Long fibNum);
}
