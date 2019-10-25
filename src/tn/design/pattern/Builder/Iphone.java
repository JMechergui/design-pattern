package tn.design.pattern.Builder;

public class Iphone {

	private String model;

	private String color;

	private String storage;

	public Iphone() {
		super();
	}

	public Iphone(String model, String color, String storage) {
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
}