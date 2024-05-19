package designpattern.study.design.pattern.demo.facade.before;

public class CoffeeMakerService {
    public void grindBeans() {
        System.out.println("원두를 갈았습니다.");
    }

    public void extractShot() {
        System.out.println("샷을 추출했습니다.");
    }

    public void makeAmericano() {
        System.out.println("물과 얼음을 넣어 아메리카노를 만들었습니다.");
    }
}
