package panta.feignClient.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import panta.model.demo.DemoModel;

@FeignClient(name="service-main")
public interface MainFeignClient {

    @RequestMapping("/getDemo")
    DemoModel getDemo(DemoModel demoModel);

    @RequestMapping("/addDemo")
    boolean addDemo(DemoModel demoModel);

    @RequestMapping("/addDemoLog")
    boolean addDemoLog(DemoModel demoModel);
}
