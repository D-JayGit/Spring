package spring.spring_demo;

public class CricketCoach implements Coach {

	private HappyFortuneService service;
	
	public CricketCoach(HappyFortuneService service) {
		super();
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily 10 Rounds";
	}

	@Override
	public String getDailyFortune() {
		return service.getFortune();
	}
	

}
