package panta.controller;

import org.panta.common.enums.SimpleDateFormatType;
import org.panta.common.utils.DateCommonUtil;
import panta.feignClient.demo.MainFeignClient;
import panta.model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private MainFeignClient demoFeignClient;

    @PostMapping("/getDemo")
    public DemoModel getDemo(@RequestBody DemoModel demo){
        DemoModel demoModel = demoFeignClient.getDemo(demo);
        return demoModel;
    }

    @PostMapping("/getDate")
    public String getDate(@RequestBody DemoModel demo){
        DateCommonUtil dateCommonUtil = new DateCommonUtil();
        return dateCommonUtil.dateFormatFormat(SimpleDateFormatType.dateFormatYYYYMMDDHHmmss.getType(),new Date());
    }
}
