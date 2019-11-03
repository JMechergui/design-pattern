package tn.design.pattern.composite;

public class Test {

	public static void main(String[] args) {

		Composite insidePhone = new Composite("insidePhone");

		Component ram = new Leaf("ram", 50F);
		Component process = new Leaf("process", 250F);
		Component screen = new Leaf("screen", 100F);

		insidePhone.addComponent(ram);
		insidePhone.addComponent(process);
		insidePhone.addComponent(screen);

		Composite ousidePhone = new Composite("ousidePhone");

		Component headphone = new Leaf("headphone", 20F);
		Component charger = new Leaf("charger", 30F);
		
		ousidePhone.addComponent(headphone);
		ousidePhone.addComponent(charger);

		Composite iphone = new Composite("iphone");
		
		iphone.addComponent(insidePhone);
		iphone.addComponent(ousidePhone);
		
		
		
		iphone.description();
		System.out.println(iphone.cost());
		
	}

}
