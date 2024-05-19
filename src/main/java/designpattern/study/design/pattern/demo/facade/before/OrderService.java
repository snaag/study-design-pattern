package designpattern.study.design.pattern.demo.facade.before;

public class OrderService {
    public void goToCounter() {
        System.out.println("카운터로 이동합니다.");
    }

    public void makeOrder() {
        System.out.println("커피 주문을 받았습니다.");
    }

    public void handOverCoffee() {
        System.out.println("커피를 전달했습니다.");
    }
}
