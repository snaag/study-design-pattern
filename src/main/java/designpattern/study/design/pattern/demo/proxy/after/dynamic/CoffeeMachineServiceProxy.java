package designpattern.study.design.pattern.demo.proxy.after.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CoffeeMachineServiceProxy implements InvocationHandler {
    private final CoffeeMachineService service;
    private final CoffeeMachineTimer timer;

    public CoffeeMachineServiceProxy(CoffeeMachineService service, CoffeeMachineTimer timer) {
        this.service = service;
        this.timer = timer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        timer.start();
        Object result = method.invoke(service, args);
        timer.end();
        return result;
    }

    public static CoffeeMachineService createProxy(CoffeeMachineService service, CoffeeMachineTimer timer) {
        return (CoffeeMachineService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                new Class[]{CoffeeMachineService.class},
                new CoffeeMachineServiceProxy(service, timer)
        );
    }
}
