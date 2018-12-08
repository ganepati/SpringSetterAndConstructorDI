package beans;

public class Car {
	private String carUser;
	private String[] carName;
	private Engine[] engine;

	public String getCarUser() {
		return carUser;
	}

	public void setCarUser(String carUser) {
		this.carUser = carUser;
	}	

	public String[] getCarName() {
		return carName;
	}

	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void printData() {
		System.out.println("Car User :" + getCarUser());
		for(String cars:carName) {
			System.out.println("CarName : "+cars);
		}
		for(Engine engines:engine) {
			System.out.println("ModelYear : "+engines.getModelYear());
		}
	}

}
