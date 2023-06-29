package panta.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.panta.common.enums.SimpleDateFormatType;
import org.panta.common.utils.DateCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import panta.feignClient.demo.MainFeignClient;
import panta.model.demo.DemoModel;
import panta.redis.RedisUtils;
import panta.service.demo.DemoService;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
@Api(tags = "标准TEST接口")
public class TestController {

    @PostMapping("/getDate")
    @ApiOperation(value = "getDate", notes = "获取当前格式化后时间")
    public String getDate(@ApiParam(name = "随便传个字符串吧", defaultValue = "{}")
                          @RequestBody String str){
        return DateCommonUtil.dateFormatFormat(SimpleDateFormatType.dateFormatYYYYMMDDHHmmss.getType(),new Date());
    }
}
