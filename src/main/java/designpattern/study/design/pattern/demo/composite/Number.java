package designpattern.study.design.pattern.demo.composite;

public class Number implements Component {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int operation() {
        return value;
    }
}

