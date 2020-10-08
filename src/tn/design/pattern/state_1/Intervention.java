package tn.design.pattern.state_1;

public class Intervention {

	private int etat;
	private int code;

	private State state;

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void update(String actionName) throws Exception {

		if (actionName.equals("PLANNED")) {
			state = new PlannedState();
		} else if (actionName.equals("CLOSEDOK")) {
			state = new ClosedOKState();
		} else if (actionName.equals("CLOSEDNOK")) {
			state = new ClosedNOKState();
		} else if (actionName.equals("QUALIFIED")) {
			state = new QualifiedState();
		}
		state.update(this);

		System.out.println("current state is "+this.toString());
	}

	public boolean isClosed(){
		if(etat==3||etat ==4)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Intervention [etat=" + etat + ", code=" + code + "]";
	}

}
