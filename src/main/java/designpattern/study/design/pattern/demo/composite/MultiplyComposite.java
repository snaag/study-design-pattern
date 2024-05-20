package designpattern.study.design.pattern.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements Component {
    private final List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    @Override
    public int operation() {
        int result = 1;
        for (Component child : children) {
            result *= child.operation();
        }
        return result;
    }
}