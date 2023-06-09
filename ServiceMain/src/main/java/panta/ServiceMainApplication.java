package panta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "panta.mapper.*")
public class ServiceMainApplication {
    public static void main(String []args){
        //启动类
        SpringApplication.run(ServiceMainApplication.class);
    }

}
