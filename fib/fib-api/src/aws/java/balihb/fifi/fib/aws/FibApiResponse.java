package balihb.fifi.fib.aws;

import org.springframework.http.ResponseEntity;

import balihb.fifi.fib.model.FibNum;

public class FibApiResponse {
    private FibNum num;
    
    public FibNum getNum() {
        return num;
    }

    public void setNum(FibNum value) {
        num = value;
    }
}
