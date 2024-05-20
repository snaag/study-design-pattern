package designpattern.study.design.pattern.demo.composite;

public class CompositeClient {
    public void run() {
        // 3 * max(7, 10)

        // 숫자 노드 생성
        Component number7 = new Number(7);
        Component number10 = new Number(10);

        // max(7, 10) 노드 생성
        MaxComposite maxNode = new MaxComposite();
        maxNode.add(number7);
        maxNode.add(number10);

        // 3 * max(7, 10) 노드 생성
        Component number3 = new Number(3);
        MultiplyComposite multiplyNode = new MultiplyComposite();
        multiplyNode.add(number3);
        multiplyNode.add(maxNode);

        // 계산 및 출력
        System.out.println("총계 : " + multiplyNode.operation());
    }
}
