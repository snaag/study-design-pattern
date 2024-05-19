package designpattern.study.design.pattern.demo.flyweight.after.domain;

public class Coordinate {
    private int posX;
    private int posY;
    private int posZ;
    private final int size = 20;

    public int getSize() {
        return size;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }
}
