package tn.design.pattern.state;

public class Test {

	public static void main(String[] args) {
		Gate gate=new Gate();
		
		gate.description();
		
		gate.pay();
	

		
		gate.description();
		
		gate.open();
		
		gate.description();
		
		gate.closed();
		
		gate.description();
	}

}
