package tn.design.pattern.Builder;

import java.util.List;

public class Iphone {

	private String model;

	private String color;

	private String storage;

	private List<String> features;

	public Iphone() {
		super();
	}

	public Iphone(String model, String color, String storage, List<String> features) {
		super();
		this.model = model;
		this.color = color;
		this.storage = storage;
		this.features = features;
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

	public List<String> getFeatures() {
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Iphone [model=" + model + ", color=" + color + ", storage=" + storage + ", features=" + features + "]";
	}

	 
}