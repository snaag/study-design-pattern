package designpattern.study.design.pattern.demo.proxy.before;

public class ProxyClient {
    CoffeeMachineService service = new CoffeeMachineService(new CoffeeMachineTimer());
    public void run() {
        service.makeEspresso();
        service.makeAmericano();
        service.makeLatte();
    }
}
