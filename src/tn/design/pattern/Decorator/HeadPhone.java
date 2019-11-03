package tn.design.pattern.Decorator;

public class HeadPhone extends IphoneFeature{

	
	private Iphone iphone;
	
	
	public HeadPhone(Iphone iphone) {
		super();
		this.iphone = iphone;
	}

	@Override
	public void description() {
		iphone.description();
		System.out.println("phone has charger as a feature");
		
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return iphone.cost()+20;
	}
	@Override
	public String toString() {
		return iphone.toString();
	}
	
}
