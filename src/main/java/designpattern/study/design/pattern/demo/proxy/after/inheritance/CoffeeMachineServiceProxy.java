package designpattern.study.design.pattern.demo.proxy.after.inheritance;

public class CoffeeMachineServiceProxy implements ICoffeeMachineService {
    private final CoffeeMachineTimer timer; // 의존성 주입
    private final CoffeeMachineService service; // 의존성 주입

    public CoffeeMachineServiceProxy(CoffeeMachineTimer givenTimer, CoffeeMachineService givenService) {
        timer = givenTimer;
        service = givenService;
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
