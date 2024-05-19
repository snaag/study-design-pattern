package designpattern.study.design.pattern.demo.flyweight.after;

import designpattern.study.design.pattern.demo.flyweight.before.domain.*;

import java.util.ArrayList;
import java.util.List;

// ConcreteFlyweight - 플라이웨이트 객체는 불변성을 가져야한다. 변경되면 모든 것에 영향을 주기 때문이다.
// 출처: https://inpa.tistory.com/entry/GOF-💠-Flyweight-패턴-제대로-배워보자 [Inpa Dev 👨‍💻:티스토리]
public final class MushroomModel {
    private final MassiveMesh mesh;
    private final MassiveTexture texture;
    private final List<MassiveSkill> skills = new ArrayList<>();


    public MushroomModel(MassiveMesh mesh, MassiveTexture texture) {
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
        return mesh.getSize() +
                texture.getSize() +
                skills.stream().mapToInt(MassiveSkill::getSize).sum();
    }
}
