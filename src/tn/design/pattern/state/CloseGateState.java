package tn.design.pattern.state;

public class CloseGateState implements GateState {

	
	private Gate gate;
	
	
	public CloseGateState(Gate gate)
	{
		this.gate=gate;
	}
	
	
	@Override
	public void open() {
		gate.setGateState(new CloseGateState(gate));
		
	}

	@Override
	public void pay() {
		gate.setGateState(new OpenGateState(gate));
		
	}

	@Override
	public void closed() {
		gate.setGateState(new CloseGateState(gate));
		
	}


	@Override
	public void description() {
		System.out.println("CLOSE STATE ...");
		
	}

}
