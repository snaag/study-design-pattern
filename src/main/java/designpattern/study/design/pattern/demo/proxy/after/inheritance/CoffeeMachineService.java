package designpattern.study.design.pattern.demo.proxy.after.inheritance;

public class CoffeeMachineService implements ICoffeeMachineService{
    public void makeEspresso() {
        System.out.println("에스프레소를 만들었습니다.");
    }

    public void makeAmericano() {
        System.out.println("아메리카노를 만들었습니다.");
    }

    public void makeLatte() {
        System.out.println("라떼를 만들었습니다.");
    }
}
