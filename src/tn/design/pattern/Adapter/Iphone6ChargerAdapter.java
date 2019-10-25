package tn.design.pattern.Adapter;

public class Iphone6ChargerAdapter  implements IphoneCharger6I{

	private Charger charger;
	
	Iphone6ChargerAdapter(){	
	}
	
	Iphone6ChargerAdapter(Charger charger){
		
		this.charger=charger;
	}
		
	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		charger.charge();
	}
}