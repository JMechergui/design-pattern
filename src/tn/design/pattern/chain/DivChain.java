package tn.design.pattern.chain;

public class DivChain implements Chain {

	private Chain nextChain;

	@Override
	public void nextChain(Chain chain) {
		// TODO Auto-generated method stub
		this.nextChain = chain;
	}

	@Override
	public void calculate(Request request) {
		// TODO Auto-generated method stub

		if (request.getOperation().equals(Opearation.DIV)) {
			System.out.println("X / Y = " + (request.getX() / request.getY()));
		} else {
			
			if(nextChain!=null){
				System.out.println(nextChain);
				nextChain.calculate(request);
			}else{
				System.out.println("end of chain");
			}
		}
	}
}