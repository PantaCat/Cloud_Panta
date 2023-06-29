package panta.common.exceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import panta.model.demo.DemoModel;
import panta.service.demo.DemoService;

import java.math.BigDecimal;
import java.net.ConnectException;

@RestControllerAdvice
public class DemoExceptionHandler {
    @Autowired
    private DemoService demoService;

    /*
     *@ExceptionHandler注解中可以添加参数，
     *参数是某个异常类的class，代表这个方法专门处理该类异常，比如这样：
     */
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticExceptionHandler(Exception exception){
        exception.printStackTrace();
        String message = "[DemoExceptionHandler]-"+exception.getMessage();
        System.out.println(message);
        DemoModel d = new DemoModel();
        d.setName(message);
        d.setNumber(new BigDecimal("100"));
        demoService.addDemoLog(d);
        return message;
    }
}
