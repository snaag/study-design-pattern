package designpattern.study.design.pattern.demo.flyweight.after;

import designpattern.study.design.pattern.demo.flyweight.after.domain.Coordinate;
import designpattern.study.design.pattern.demo.flyweight.after.domain.Health;

public class AfterFlyweightClient {
    int MAX = 10;

    public void run() {
        int sum = 0;

        for (int i = 0; i < MAX; i++) {
            Coordinate coordinate = new Coordinate();
            Health health = new Health();

            Mushroom mushroom = new Mushroom(coordinate, health);

            sum = mushroom.getSize() + sum;

            System.out.println("sum = " + sum);
        }
    }
}
