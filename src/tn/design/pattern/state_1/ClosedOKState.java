package tn.design.pattern.state_1;

public class ClosedOKState implements State {

	@Override
	public void update(Intervention intervention) throws Exception {
		if (!intervention.isClosed()) {
			intervention.setEtat(3);
			intervention.setCode(1);
		} else {
			throw new Exception("intervention is already closed");
		}
	}

}
