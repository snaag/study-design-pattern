package designpattern.study.design.pattern.demo;

import designpattern.study.design.pattern.demo.composite.CompositeClient;
import designpattern.study.design.pattern.demo.flyweight.after.AfterFlyweightClient;
import designpattern.study.design.pattern.demo.flyweight.before.BeforeFlyweightClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternDemoApplication.class, args);

//		runBeforeFlyweight();
//		runAfterFlyweight();
		runComposite();

	}

	public static void runBeforeFlyweight() {
		BeforeFlyweightClient beforeFlyweightClient = new BeforeFlyweightClient();
		beforeFlyweightClient.run();
	}

	public static void runAfterFlyweight() {
		AfterFlyweightClient afterFlyweightClient = new AfterFlyweightClient();
		afterFlyweightClient.run();
	}

	public static void runComposite() {
		CompositeClient compositeClient = new CompositeClient();
		compositeClient.run();
	}

}
