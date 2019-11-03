package tn.design.pattern.Decorator;

public class Iphone6 implements Iphone {

	private String model;
	
	private String color;
	
	private String storage;
			 
	public Iphone6(String model, String color, String storage) {
		super();
		this.model = model;
		this.color = color;
		this.storage = storage;
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
 

	@Override
	public String toString() {
		return "Iphone [model=" + model + ", color=" + color + ", storage=" + storage + "]";
	}

	@Override
	public void description() {
		System.out.println(this.toString());		
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 150;
	}		
}