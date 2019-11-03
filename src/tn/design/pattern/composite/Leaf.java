package tn.design.pattern.composite;

public class Leaf implements Component{

	private String name;
	
	private Float price;

	
	public Leaf(String name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void description() {
		System.out.println("Leaf is "+name+" price : "+price);
		
	}

	@Override
	public Float cost() {
		return price;
		
	}
}