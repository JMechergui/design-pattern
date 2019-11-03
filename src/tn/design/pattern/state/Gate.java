package tn.design.pattern.state;

public class Gate implements GateState{

	
	private GateState gateState=new CloseGateState(this);

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
		this.gateState.open();
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		this.gateState.pay();
	}

	@Override
	public void closed() {
		// TODO Auto-generated method stub
		
		this.gateState.closed();
		
	}

	public GateState getGateState() {
		return gateState;
	}

	public void setGateState(GateState gateState) {
		this.gateState = gateState;
	}

	@Override
	public void description() {
		this.gateState.description();
		
	}
	
	
	
}
