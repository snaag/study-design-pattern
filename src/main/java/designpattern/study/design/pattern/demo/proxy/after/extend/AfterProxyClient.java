package designpattern.study.design.pattern.demo.proxy.after.extend;

public class AfterProxyClient {
    private final CoffeeMachineService service;

    public AfterProxyClient(CoffeeMachineService givenService) {
        this.service = givenService;
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
