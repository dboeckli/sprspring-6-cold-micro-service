package ch.dboeckli.springframeworkguru.spring6coldmicroservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Spring6ColdMicroServiceApplication {
    public static void main(String[] args) {
        log.info("Starting Spring 6 Cold Microservice");
        SpringApplication.run(Spring6ColdMicroServiceApplication.class, args);
    }

}
