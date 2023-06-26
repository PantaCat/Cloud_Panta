package panta.controller;

import panta.model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import panta.service.demo.DemoService;

import java.math.BigDecimal;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("/getDemo")
    public DemoModel getDemo(@RequestBody DemoModel demo){
        DemoModel demoModel = demoService.getDemo(demo);
        return demoModel;
    }

    @PostMapping("/addDemo")
    public boolean addDemo(@RequestBody DemoModel demo){
        try{
            demoService.addDemo(demo);
        }catch (Exception e){
            e.printStackTrace();
            DemoModel d = new DemoModel();
            d.setName("异常日志");
            d.setNumber(new BigDecimal("100"));
            demoService.addDemoLog(d);
            return false;
        }
        return true;
    }

    @PostMapping("/addDemoLog")
    public boolean addDemoLog(@RequestBody DemoModel demo){
        try{
            demoService.addDemoLog(demo);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
