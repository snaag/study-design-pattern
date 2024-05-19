package designpattern.study.design.pattern.demo.facade.before;

public class BeforeFacadeClient {
    private final OrderService orderService;
    private final CoffeeMakerService coffeeMakerService;
    private final CleaningService cleaningService;

    public BeforeFacadeClient(OrderService orderService, CoffeeMakerService coffeeMakerService, CleaningService cleaningService) {
        this.orderService = orderService;
        this.coffeeMakerService = coffeeMakerService;
        this.cleaningService = cleaningService;
    }

    public void run() {
        order();
        makeCoffee();
        handOver();
        clean();
    }


    public void order() {
        orderService.goToCounter();
        orderService.makeOrder();
    }

    public void makeCoffee() {
        coffeeMakerService.grindBeans();
        coffeeMakerService.extractShot();
        coffeeMakerService.makeAmericano();
    }

    public void handOver() {
        orderService.handOverCoffee();

    }

    public void clean() {
        cleaningService.sweep();
        cleaningService.mop();
    }
}
