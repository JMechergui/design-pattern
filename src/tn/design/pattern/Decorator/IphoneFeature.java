package tn.design.pattern.Decorator;

public abstract class IphoneFeature implements  Iphone{

	private Iphone iphone;
	
	
	
	public IphoneFeature() {
		super();
	}

	public IphoneFeature(Iphone iphone) {
		super();
		this.iphone = iphone;
	}

	public Iphone getIphone() {
		return iphone;
	}

	public void setIphone(Iphone iphone) {
		this.iphone = iphone;
	}
}
