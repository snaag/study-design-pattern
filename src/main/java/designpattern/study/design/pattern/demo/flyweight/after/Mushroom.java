package designpattern.study.design.pattern.demo.flyweight.after;


import designpattern.study.design.pattern.demo.flyweight.after.domain.Coordinate;
import designpattern.study.design.pattern.demo.flyweight.after.domain.Health;

// UnsahredConcreteFlyweight

public class Mushroom {
    private final Coordinate coordinate;
    private final Health health;
    MushroomModel mushroomModel;

    public Mushroom(Coordinate coordinate, Health health) {
        this.coordinate = coordinate;
        this.health = health;
        MushroomModel mushroomModel = MushroomFactory.getInstance("주황 버섯");
    }


    public int getSize() {
        if(mushroomModel == null) {
            return coordinate.getSize() +
                    health.getSize();
        }

        return coordinate.getSize() +
                health.getSize() +
                mushroomModel.getSize();
    }
}
