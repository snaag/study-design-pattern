package designpattern.study.design.pattern.demo.flyweight.after;

import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveMesh;
import designpattern.study.design.pattern.demo.flyweight.before.domain.MassiveTexture;
import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Pool : HashMap 컬렉션을 통해 키(key) 와 나무 모델 객체를 저장하는 캐시 저장소 역할
 * getInstance 메서드 : Pool에 가져오고자 하는 객체가 있는지 검사를 하여 있으면 그대로 반환, 없으면 새로 생성
 * 출처: https://inpa.tistory.com/entry/GOF-💠-Flyweight-패턴-제대로-배워보자 [Inpa Dev 👨‍💻:티스토리]
 */

// FlyweightFactory
public class MushroomFactory {

    // Flyweight Pool - TreeModel 객체들을 Map으로 등록하여 캐싱
    private static final Map<String, MushroomModel> mushroomModelCache = new HashMap<>();

    public static MushroomModel getInstance(String key) {
        if (!mushroomModelCache.containsKey(key)) {
            // 캐시 되어있지 않으면 나무 모델 객체를 새로 생성하고 반환
            MassiveMesh mesh = new MassiveMesh();
            MassiveTexture texture = new MassiveTexture();
            MushroomModel mushroomModel = new MushroomModel(mesh, texture);

            System.out.println("MushroomModel 객체 새로 생성 완료");

            mushroomModelCache.put(key, mushroomModel);
        }

        // 캐시 되어 있다면 그대로 가져와서 반환
        return mushroomModelCache.get(key);
    }
}