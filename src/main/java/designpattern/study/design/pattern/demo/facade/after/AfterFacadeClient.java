package designpattern.study.design.pattern.demo.facade.after;

public class AfterFacadeClient {
    private final CafeFacade cafeFacade;

    public AfterFacadeClient(CafeFacade cafeFacade) {
        this.cafeFacade = cafeFacade;
    }

    public void run() {
        cafeFacade.serve();

        /**
         * 또는 ...
         *
         * cafeFacade.order();
         * cafeFacade.makeCoffee();
         * cafeFacade.handOver();
         * cafeFacade.clean();
         *
         * 클라이언트가 여전히 서브시스템의 세부 사항을 알 필요 없이
         * 파사드의 메서드를 통해 필요한 작업을 수행할 수 있으므로
         * 하나를 호출하건, 여러개를 호출하건 상관없음
         *
         */
    }
}
