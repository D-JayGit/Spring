package spring.spring_demo;

public class BaseballCoach implements Coach {

	HappyFortuneService service;
	
	public BaseballCoach(HappyFortuneService service) {
		super();
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily 50 Jumpsss";
	}

	@Override
	public String getDailyFortune() {
		return service.getFortune();
	}
	
	

}
