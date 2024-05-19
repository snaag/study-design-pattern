package designpattern.study.design.pattern.demo.proxy.after;

public class ProxyClient {
    ICoffeeMachineService service;

    public ProxyClient(ICoffeeMachineService serviceProxy) {
        service = serviceProxy;
    }

    public void makeEspresso() {
        service.makeEspresso();
    }

    public void makeAmericano() {
        service.makeAmericano();
    }

    public void makeLatte() {
        service.makeLatte();
    }
}
