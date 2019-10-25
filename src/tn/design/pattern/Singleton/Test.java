package tn.design.pattern.Singleton;import java.lang.ref.PhantomReference;

public class Test {

	public static void main(String[] args) {
 
		Iphone iphone=Iphone.getInstance();
		
		iphone.setColor("WHITE");
		iphone.setModel("X");
		
		System.out.println(iphone);
		
		Iphone iphone1=Iphone.getInstance();

		System.out.println(iphone1);
		
		Iphone iphone2=Iphone.getInstance();
		
		iphone2.setColor("RED");
		iphone2.setStorage("64G");
		
		System.out.println(iphone2);
		
		System.out.println(iphone);
	}

}
