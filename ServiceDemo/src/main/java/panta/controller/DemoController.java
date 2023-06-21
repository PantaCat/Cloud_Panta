package panta.controller;

import org.panta.common.enums.SimpleDateFormatType;
import org.panta.common.utils.DateCommonUtil;
import org.panta.common.utils.JsonUtil;
import panta.feignClient.demo.MainFeignClient;
import panta.model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import panta.service.demo.DemoService;
import panta.redis.RedisUtils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private MainFeignClient demoFeignClient;
    @Autowired
    private DemoService demoService;
    @Autowired
    private RedisUtils redisUtils;

    @PostMapping("/getDemo")
    public DemoModel getDemo(@RequestBody DemoModel demo){
        //查询缓存中是否存在
        boolean hasKey = redisUtils.exists(demo.getId().toString());
        DemoModel demoModel = null;
        if(hasKey){
            //获取缓存
            Object object =  redisUtils.get(demo.getId().toString());
            System.out.println("从缓存获取的数据"+ object);
            demoModel = (DemoModel) object;
            //demoModel = JsonUtil.jsonToPojo(redisUtils.get(demo.getId().toString(), 10).toString(),DemoModel.class);
        }else{
            //从数据库中获取信息
            System.out.println("从数据库中获取数据");
            demoModel = demoService.getDemo(demo);
            //数据插入缓存（set中的参数含义：key值，user对象，缓存存在时间10（long类型），时间单位）
            redisUtils.set(demo.getId().toString(),demoModel,10L, TimeUnit.MINUTES);
            //redisUtils.set(demo.getId().toString(), demoModel, 10, true, null);
            System.out.println("数据插入缓存" + demoModel.toString());
        }
        return demoModel;
    }

    @PostMapping("/addDemo")
    public boolean addDemo(@RequestBody DemoModel demo){
        try{
            demoFeignClient.addDemo(demo);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @PostMapping("/getDate")
    public String getDate(){
        return DateCommonUtil.dateFormatFormat(SimpleDateFormatType.dateFormatYYYYMMDDHHmmss.getType(),new Date());
    }
}
