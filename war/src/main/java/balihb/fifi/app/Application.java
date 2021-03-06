package balihb.fifi.app;

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
import balihb.fifi.fib_timer.impl.FibtimerImpl;
import balihb.fifi.fib.injvm.InJvmFibApiCaller;

@SpringBootApplication
//@ComponentScan(basePackages = {"balihb.fifi"})
@Import({ FibImpl.class, FibtimerImpl.class, InJvmFibApiCaller.class })
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

