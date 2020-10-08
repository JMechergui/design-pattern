package tn.design.pattern.template;

public class EBerline extends EclassTemplate {

	public EBerline() {
		super("E_berline");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void settingChassis() {
		System.out.println("Setting Chassis 4.72");
		

	}

	@Override
	public void mountingTires() {
		// TODO Auto-generated method stub
		System.out.println("Setting tires 18 inch");
	}

	@Override
	public void mountingWheels() {
		// TODO Auto-generated method stub
		System.out.println("Setting Wheels 18 inch");

	}

	@Override
	public void mountingdoors() {
		// TODO Auto-generated method stub
				System.out.println("Setting 4 doors sedan 18 inch");

	}

}
