package balihb.fifi.fib.aws;

import org.springframework.http.ResponseEntity;

import balihb.fifi.fib.model.FibNum;

public class FibApiResponse {
    private FibNum fibNum;
    
    public FibNum getFibNum() {
        return fibNum;
    }

    public void setFibNum(FibNum value) {
        fibNum = value;
    }
}
