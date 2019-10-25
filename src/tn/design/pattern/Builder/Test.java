package tn.design.pattern.Builder;import java.lang.ref.PhantomReference;

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
				.getIphone());
		

		IphoneBuilder builder3=new IphoneBuilder();
		System.out.println(builder3.getIphone());
		
	}
	

}
