package designpattern.study.design.pattern.demo.proxy.before;

public class ProxyClient {
    CoffeeMachineService service;
    CoffeeMachineTimer timer;

    public ProxyClient(CoffeeMachineService service, CoffeeMachineTimer timer) {
        this.service = service;
        this.timer = timer;
    }

    public void run() {
        service.makeEspresso();
        service.makeAmericano();
        service.makeLatte();
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
