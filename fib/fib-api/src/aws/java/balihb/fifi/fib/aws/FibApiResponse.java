package balihb.fifi.fib.aws;

import org.springframework.http.ResponseEntity;

import balihb.fifi.fib.model.FibNum;

public class FibApiResponse {
    private ResponseEntity<FibNum> fibNum;
    
    public ResponseEntity<FibNum> getFibNum() {
        return fibNum;
    }

    public void setFibNum(ResponseEntity<FibNum> value) {
        fibNum = value;
    }
}
