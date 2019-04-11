package qian.ling.yi.paycontext.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
        (scanBasePackages = "qian.ling.yi")
public class PayApplication {

    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";

    }


    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }

}
