package designpattern.study.design.pattern.demo.adapter.before;

public class LatestOrderService {
    public void greet() {
        System.out.println("인사합니다.");
    }

    public void moveToCounter() {
        System.out.println("카운터로 이동합니다.");
    }

    public void checkMenu() {
        System.out.println("주문이 가능한 메뉴를 확인합니다.");
    }

    public void takeOrder() {
        System.out.println("커피 주문을 받았습니다.");
    }

    public void handOverCoffee() {
        System.out.println("커피를 전달했습니다.");
    }

    public void sayGoodbye() {
        System.out.println("인사합니다.");
    }

    // 신규 기능
    public void parkingTicket() {
        System.out.println("주차 권을 전달했습니다.");
    }
}