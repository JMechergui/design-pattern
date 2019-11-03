package tn.design.pattern.Decorator;

public class ChargerPhone extends IphoneFeature{

	
	private Iphone iphone;
	
	
	public ChargerPhone(Iphone iphone) {
		super();
		this.iphone = iphone;
	}

	@Override
	public void description() {
		
		iphone.description();
		System.out.println("phone has headphone as a feature");
		
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return iphone.cost()+10;
	}

	@Override
	public String toString() {
		return iphone.toString();
	}
	
	

}
