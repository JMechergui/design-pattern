package tn.design.pattern.Decorator;

public class Test {

	
	public static void main(String[]args){
		
		
		Iphone iphone=   new UsbCable( new HeadPhone(new ChargerPhone(new Iphone6("iphone6","white ","64g"))))   ;
		//new HeadPhone(new ChargerPhone());
		
		
		iphone.description();
		System.out.println(iphone.cost());
		
	}
}
