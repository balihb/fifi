package balihb.fifi.fib.aws;

import balihb.fifi.fib.model.FibNum;

public class FibApiRequest {
    private Long num;

    public Long getNum() {
        return num;
    }

    public void setNum(FibNum value) {
        num = value.getNum();
    }
}
