package designpattern.study.design.pattern.demo.proxy.after;

public class AfterProxyClient {
    ICoffeeMachineService service;

    public AfterProxyClient(ICoffeeMachineService serviceProxy) {
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
