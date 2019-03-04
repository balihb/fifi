package balihb.fifi.fib_timer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import balihb.fifi.fib.FibApiCaller;
import balihb.fifi.fib.model.FibNum;
import balihb.fifi.fib_timer.api.FibtimerApi;
import balihb.fifi.fib_timer.model.FibNumDelta;

@Controller
@EnableWebMvc
public class FibtimerImpl implements FibtimerApi {

    @Autowired
    private FibApiCaller fibApiCaller;

    @Override
    public ResponseEntity<FibNumDelta> getFibNumTimer(Long fibNum) {
//        ResponseEntity<FibNum> fibNumResp;
//        long startTime = System.nanoTime();
//        fibNumResp = fibApiCaller.getFibNum(fibNum);
//        long endTime = System.nanoTime();
//        FibNumDelta fibNumDelta = new FibNumDelta();
//        fibNumDelta.setDelta(endTime - startTime);
//        if(fibNumResp.getStatusCode().is2xxSuccessful()) {
//            fibNumDelta.setNum(fibNumResp.getBody().getNum());
//            fibNumDelta.setDelta(endTime - startTime);
//            return ResponseEntity.ok(fibNumDelta);
//        }
//        return new ResponseEntity<>(fibNumResp.getHeaders(), fibNumResp.getStatusCode());
        FibNum newFib = new FibNum().num(fibNum);
        long startTime = System.nanoTime();
        FibNum fibNumResp = null;
        try {
            fibNumResp = fibApiCaller.getFibNum(newFib);
        } catch (Exception e) {
            
        }
        long endTime = System.nanoTime();
        FibNumDelta fibNumDelta = new FibNumDelta();
        fibNumDelta.setDelta(endTime - startTime);
        fibNumDelta.setNum(fibNumResp.getNum());
        return ResponseEntity.ok(fibNumDelta);
    }

}
