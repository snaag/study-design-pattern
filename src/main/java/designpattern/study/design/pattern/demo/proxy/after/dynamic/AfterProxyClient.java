package designpattern.study.design.pattern.demo.proxy.after.dynamic;

public class AfterProxyClient {
    private final CoffeeMachineService service;

    public AfterProxyClient(CoffeeMachineService service) {
        this.service = service;
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

    public void run() {
        CoffeeMachineService service = new CoffeeMachineService();
        CoffeeMachineTimer timer = new CoffeeMachineTimer();
        CoffeeMachineService proxyService = CoffeeMachineServiceProxy.createProxy(service, timer);

        AfterProxyClient client = new AfterProxyClient(proxyService);
        client.makeEspresso();
        client.makeAmericano();
        client.makeLatte();
    }
}