package designpattern.study.design.pattern.demo.flyweight.before;

import designpattern.study.design.pattern.demo.flyweight.before.domain.Coordinate;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveMesh;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveSkill;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveTexture;

import java.util.ArrayList;
import java.util.List;

public class Mushroom {
    private final Coordinate coordinate;
    private final MassiveMesh mesh;
    private final MassiveTexture texture;
    private final List<MassiveSkill> skills = new ArrayList<>();


    public Mushroom(Coordinate coordinate, MassiveMesh mesh, MassiveTexture texture) {
        this.coordinate = coordinate;
        this.mesh = mesh;
        this.texture = texture;

        MassiveSkill skill1 = new MassiveSkill();
        MassiveSkill skill2 = new MassiveSkill();
        MassiveSkill skill3 = new MassiveSkill();

        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
    }

    public int getSize() {
        return coordinate.getSize() +
                mesh.getSize() +
                texture.getSize() +
                skills.stream().mapToInt(MassiveSkill::getSize).sum();
    }
}
