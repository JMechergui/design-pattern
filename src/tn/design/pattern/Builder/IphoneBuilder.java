package tn.design.pattern.Builder;

public class IphoneBuilder {

	private String model;

	private String color;

	private String storage;

	public String getModel() {
		return model;
	}

	public IphoneBuilder setModel(String model) {
		this.model = model;

		return this;
	}

	public String getColor() {
		return color;
	}

	public IphoneBuilder setColor(String color) {
		this.color = color;

		return this;
	}

	public String getStorage() {
		return storage;
	}

	public IphoneBuilder setStorage(String storage) {
		this.storage = storage;

		return this;
	}
	
	public Iphone getIphone(){
		
		return new Iphone(model, color, storage);
	}

}
