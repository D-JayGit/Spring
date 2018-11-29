package spring.spring_demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return String.valueOf((int)(Math.random() * ((10 - 1) + 1)) + 1) + " is your lucky no. Enjoy......";
	}

}
