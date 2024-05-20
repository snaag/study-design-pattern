package designpattern.study.design.pattern.demo.adapter.before;

public class BeforeAdapterClient {
    public static void main(String[] args) {
        // 최신 주문 서비스 사용
        LatestOrderService latestOrderService = new LatestOrderService();
        System.out.println("LatestOrderService 사용:");
        latestOrderService.greet();
        latestOrderService.moveToCounter();
        latestOrderService.checkMenu();
        latestOrderService.takeOrder();
        latestOrderService.handOverCoffee();
        latestOrderService.sayGoodbye();
        latestOrderService.parkingTicket();

        System.out.println();

        // 레거시 주문 서비스 사용
        LegacyOrderService legacyOrderService = new LegacyOrderService();
        System.out.println("LegacyOrderService 사용:");
        legacyOrderService.moveToCounter();
        legacyOrderService.takeOrder();
        legacyOrderService.handOverCoffee();
    }
}
