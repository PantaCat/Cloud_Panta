package panta.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect //告诉spring这是一个aop切面类
@Component //启动的时候将该类交给spring容器管理
public class DemoAspect {

    /**
     * @Pointcut = 标记一个切入方法，被切的方法在执行前后都会执行该aop切面下的方法
     */
    @Pointcut("execution(* panta.service.demo.impl.DemoServiceImpl.addDemo(*))")
    public void Pointcut(){}

    @Before("Pointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("beforeMethod！");
    }

    @After("Pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("afterMethod！");
    }

    /**
     * @Around注解 环绕执行，就是在调用目标方法之前和调用之后，都会执行一定的逻辑
     */
    @Around("Pointcut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around前！");
        Object result = pjp.proceed();
        System.out.println("Around后！");
        return result;
    }
}
