package tn.design.pattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class IphoneBuilder {

	private String model;

	private String color;

	private String storage;

	private List<String>features;
	
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
	
	public List<String> getFeatures() {
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	public IphoneBuilder setStorage(String storage) {
		this.storage = storage;

		return this;
	}
	
	
	public IphoneBuilder addFeature(String name){
		if(features==null)
			features=new ArrayList<>();
		
		this.features.add(name);
		
		return this;
	}
	public Iphone getIphone(){
		
		return new Iphone(model, color, storage,features);
	}

}
