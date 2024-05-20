package designpattern.study.design.pattern.demo.adapter.before;

public class LegacyOrderService {
    public void moveToCounter() {
        System.out.println("카운터로 이동합니다.");
    }

    public void takeOrder() {
        System.out.println("커피 주문을 받았습니다.");
    }

    public void handOverCoffee() {
        System.out.println("커피를 전달했습니다.");
    }
}
