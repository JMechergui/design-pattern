package tn.design.pattern.template;

public class Ecoupe extends EclassTemplate {

	
	
	public Ecoupe() {
		super("Ecoupe");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void settingChassis() {
		System.out.println("Setting Chassis 4.5");
		

	}

	@Override
	public void mountingTires() {
		// TODO Auto-generated method stub
		System.out.println("Setting tires 19 inch");
	}

	@Override
	public void mountingWheels() {
		// TODO Auto-generated method stub
		System.out.println("Setting Wheels 19 inch");

	}

	@Override
	public void mountingdoors() {
		// TODO Auto-generated method stub
				System.out.println("Setting 2 doors sport");

	}
}
