package tn.design.pattern.Decorator;

public class UsbCable extends IphoneFeature{

	private Iphone iphone;
	
	
	
	
	public UsbCable(Iphone iphone) {
		super();
		this.iphone = iphone;
	}

	@Override
	public void description() {
		iphone.description(); 
		System.out.println("iphone has a Usb Cable");
		
	}

	@Override
	public float cost() {
		
		return iphone.cost()+ 10;
	}

}
