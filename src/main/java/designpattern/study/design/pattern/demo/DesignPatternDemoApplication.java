package designpattern.study.design.pattern.demo;

import designpattern.study.design.pattern.demo.flyweight.before.BeforeFlyweightClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternDemoApplication.class, args);

		runFlyweight();
	}

	public static void runFlyweight() {
		BeforeFlyweightClient beforeFlyweightClient = new BeforeFlyweightClient();
		beforeFlyweightClient.run();
	}

}
