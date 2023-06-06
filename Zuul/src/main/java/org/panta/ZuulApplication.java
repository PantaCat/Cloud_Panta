package org.panta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {
    public static void main(String []args){
        //Zuul启动类
        SpringApplication.run(ZuulApplication.class);
    }

}
