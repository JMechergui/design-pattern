package tn.design.pattern.state_1;

public class QualifiedState implements State{

	@Override
	public void update(Intervention intervention)throws Exception {

		if(!intervention.isClosed()){
			intervention.setEtat(2);
			intervention.setCode(0);
		}else{ 
			throw new Exception("qualification is not possible");
		}		
	}
}