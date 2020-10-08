package tn.design.pattern.state_1;

public class Test {

	public static void main(String[] args) throws Exception {

		Intervention i=new Intervention();
		try {
			
			i.update("PLANNED");
			i.update("CLOSEDOK");
			i.update("CLOSEDNOK");
			i.update("QUALIFIED");
		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
