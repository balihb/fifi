package balihb.fifi.fib.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

import balihb.fifi.fib.api.FibApi;
import balihb.fifi.fib.model.FibNum;

@Service
public class FibImpl implements FibApi {

    private final NativeWebRequest request;
    
    @Override
    public ResponseEntity<FibNum> getFibNum(Long fibNum) {
        return ResponseEntity.ok(new FibNum().num(10L));
    }
    
    @org.springframework.beans.factory.annotation.Autowired
    public FibImpl(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
}
