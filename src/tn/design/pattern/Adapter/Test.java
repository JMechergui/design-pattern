package tn.design.pattern.Adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
	Iphone6 iphone6=new Iphone6();
     
     iphone6.setModel("6s");
     iphone6.setColor("White");
     iphone6.setStorage("64g");
     
     //chargeur 6s
     IphoneCharger6Impl phone6Charger=new  IphoneCharger6Impl();
     
     IphoneCharger4Impl phone4Charger=new  IphoneCharger4Impl();
     
     Iphone6ChargerAdapter chargerAdapter=new Iphone6ChargerAdapter(phone4Charger);
          
     iphone6.charge(chargerAdapter);
     
	}
}