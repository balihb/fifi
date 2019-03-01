package balihb.fifi.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import balihb.fifi.fib.impl.FibImpl;

@SpringBootApplication
//@ComponentScan(basePackages = {"balihb.fifi.fib.impl", "balihb.fifi.fib.api"})
@Import({ FibImpl.class })
public class Application extends SpringBootServletInitializer {
    @Bean
    public HandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public HandlerAdapter handlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }
    public static void main(String[] args) throws Exception {
        new SpringApplication(Application.class).run(args);
    }

}
