package designpattern.study.design.pattern.demo.flyweight.before;

import designpattern.study.design.pattern.demo.flyweight.before.domain.Coordinate;
import designpattern.study.design.pattern.demo.flyweight.before.domain.Health;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveMesh;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveTexture;

public class BeforeFlyweightClient {
    int MAX = 10;

    public void run() {
        int sum = 0;

        for (int i = 0; i < MAX; i++) {
            Health health = new Health();
            Coordinate coordinate = new Coordinate();
            MassiveMesh mesh = new MassiveMesh();
            MassiveTexture texture = new MassiveTexture();

            Mushroom mushroom = new Mushroom(coordinate, health, mesh, texture);
            sum = mushroom.getSize() + sum;

            System.out.println("sum = " + sum);
        }
    }
}
