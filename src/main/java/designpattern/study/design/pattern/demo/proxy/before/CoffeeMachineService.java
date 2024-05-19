package designpattern.study.design.pattern.demo.proxy.before;

public class CoffeeMachineService {
    CoffeeMachineTimer timer;

    public CoffeeMachineService(CoffeeMachineTimer timer) {
        this.timer = timer;
    }

    public void makeEspresso() {
        timer.start();
        System.out.println("에스프레소를 만들었습니다.");
        timer.end();
    }

    public void makeAmericano() {
        timer.start();
        System.out.println("아메리카노를 만들었습니다.");
        timer.end();
    }

    public void makeLatte() {
        timer.start();
        System.out.println("라떼를 만들었습니다.");
        timer.end();
    }
}
