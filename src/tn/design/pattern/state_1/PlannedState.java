package tn.design.pattern.state_1;

public class PlannedState implements State{

	@Override
	public void update(Intervention intervention) {

		if(!intervention.isClosed()){
			intervention.setEtat(1);
			intervention.setCode(0);
		}else{
			new Exception("reshcedule is not possible");
		}
		
		
	}

}
