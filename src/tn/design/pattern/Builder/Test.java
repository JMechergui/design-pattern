package tn.design.pattern.Builder;

public class Test {

	public static void main(String[] args) {
	
		IphoneBuilder builder1=new IphoneBuilder();
		
		System.out.println( builder1
		.setColor("RED")
		.setModel("6")
		.setStorage("20G")
		.getIphone());
		
		IphoneBuilder builder2=new IphoneBuilder();
		
		System.out.println( builder2
				.setColor("WHITE")
				.setModel("X")
				.setStorage("200G")
				.addFeature("test")
				.addFeature("test1")
				.addFeature("test1")
				.addFeature("test1")
				.addFeature("test1")
				.getIphone());
		

		IphoneBuilder builder3=new IphoneBuilder();
		System.out.println(builder3.getIphone());
		
	}
	

}
