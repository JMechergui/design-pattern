package tn.design.pattern.state;

public class OpenGateState implements GateState {

	
	private Gate gate;
	
	
	public OpenGateState(Gate gate)
	{
		this.gate=gate;
	}
	
	
	@Override
	public void open() {
		this.gate.setGateState(new OpenGateState(gate));
		
	}

	@Override
	public void pay() {
		this.gate.setGateState(new OpenGateState(gate));
		
	}

	@Override
	public void closed() {
		this.gate.setGateState(new CloseGateState(gate));
		
	}


	@Override
	public void description() {
		System.out.println("OPEN STATE ...");
		
	}

}
