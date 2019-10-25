package tn.design.pattern.Singleton;

public class Iphone {

	private String model;
	
	private String color;
	
	private String storage;
	
	
	
	private static Iphone iphone;

	public static Iphone getInstance() {
		if (iphone == null)
			iphone = new Iphone();

		return iphone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public static Iphone getIphone() {
		return iphone;
	}

	public static void setIphone(Iphone iphone) {
		Iphone.iphone = iphone;
	}

	@Override
	public String toString() {
		return "Iphone [model=" + model + ", color=" + color + ", storage=" + storage + "]";
	}		
}