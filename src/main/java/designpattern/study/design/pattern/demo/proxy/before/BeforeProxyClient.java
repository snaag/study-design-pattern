package designpattern.study.design.pattern.demo.proxy.before;

public class BeforeProxyClient {
    CoffeeMachineService service;
    CoffeeMachineTimer timer;

    public BeforeProxyClient(CoffeeMachineService service, CoffeeMachineTimer timer) {
        this.service = service;
        this.timer = timer;
    }

    public void makeEspresso() {
        timer.start();
        service.makeEspresso();
        timer.end();
    }

    public void makeAmericano() {
        timer.start();
        service.makeAmericano();
        timer.end();
    }

    public void makeLatte() {
        timer.start();
        service.makeLatte();
        timer.end();
    }
}
