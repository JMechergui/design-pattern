package tn.design.pattern.Decorator;

public class Data implements StringHelper {

	private String data;
	
	public Data(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String execute() {		 
		return data;
	}	
}