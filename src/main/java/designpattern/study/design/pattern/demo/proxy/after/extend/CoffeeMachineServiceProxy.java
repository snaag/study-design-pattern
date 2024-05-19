package designpattern.study.design.pattern.demo.proxy.after.extend;

public class CoffeeMachineServiceProxy extends CoffeeMachineService {
    private final CoffeeMachineTimer timer;

    public CoffeeMachineServiceProxy(CoffeeMachineTimer givenTimer) {
        timer = givenTimer;
    }

    public void makeEspresso() {
        timer.start();
        super.makeEspresso();
        timer.end();
    }

    public void makeAmericano() {
        timer.start();
        super.makeAmericano();
        timer.end();
    }

    public void makeLatte() {
        timer.start();
        super.makeLatte();
        timer.end();
    }
}
