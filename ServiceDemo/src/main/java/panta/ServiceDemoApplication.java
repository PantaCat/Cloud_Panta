package panta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@MapperScan(value = "panta.mapper.*")
public class ServiceDemoApplication {
    public static void main(String []args){
        //启动类
        SpringApplication.run(ServiceDemoApplication.class);
    }

}
