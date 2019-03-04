package balihb.fifi.fib.impl;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import balihb.fifi.fib.api.FibApi;
import balihb.fifi.fib.model.FibNum;

@Controller
@EnableWebMvc
public class FibImpl implements FibApi {

    @Override
    public ResponseEntity<FibNum> fibPost(@Valid FibNum fibNum) {
        return ResponseEntity.ok(new FibNum().num(15L));
    }

//    @Override
//    public ResponseEntity<FibNum> getFibNum(Long fibNum) {
//        return ResponseEntity.ok(new FibNum().num(15L));
//    }

}
