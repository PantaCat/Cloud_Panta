package org.panta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceMainApplication {
    public static void main(String []args){
        //启动类
        SpringApplication.run(ServiceMainApplication.class);
    }

}
