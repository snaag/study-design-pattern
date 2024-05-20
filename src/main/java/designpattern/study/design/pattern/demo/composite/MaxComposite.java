package designpattern.study.design.pattern.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class MaxComposite implements Component {
    private final List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    @Override
    public int operation() {
        int result = children.get(0).operation();
        for (Component child : children) {
            result = Math.max(result, child.operation());
        }
        return result;
    }
}

