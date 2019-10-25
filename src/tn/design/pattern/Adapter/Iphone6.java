package tn.design.pattern.Adapter;

public class Iphone6 {

	private String model;
	
	private String color;
	
	private String storage;
	
	
	void charge(IphoneCharger6I iphoneCharger6I){
		
		System.out.println("my phone is charging "+model+" -- "+color+" -- "+storage);
		iphoneCharger6I.charge();
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
}