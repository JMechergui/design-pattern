package tn.design.pattern.template;

public abstract class EclassTemplate {

	protected String name; 
	
	
	public EclassTemplate(String name) {
		super();
		this.name = name;
	}

	public void assemble(){
		
		System.out.println("About to assemble "+name);
		settingChassis();
		mountingTires();
		mountingWheels();
		mountingdoors();
		System.out.println();
		
	}
	
	public abstract void settingChassis();
	
	public abstract void mountingTires();
	
	public abstract void mountingWheels();
	
	public abstract void mountingdoors() ;
	
}
