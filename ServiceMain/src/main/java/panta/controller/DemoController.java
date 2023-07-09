package panta.controller;

import panta.model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import panta.model.demo.DemoMyBatisModel;
import panta.model.demo.DemoMyBatisPlusModel;
import panta.service.demo.DemoService;

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
        demoService.addDemo(demo);
        return true;
    }

    @PostMapping("/addDemoMyBatis")
    public int addDemoMyBatis(@RequestBody DemoMyBatisModel demo){
        return demoService.addDemoMyBatis(demo);
    }

    @PostMapping("/addDemoMyBatisPlus")
    public int addDemoMyBatisPlus(@RequestBody DemoMyBatisPlusModel demo){
        return demoService.addDemoMyBatisPlus(demo);
    }
}
