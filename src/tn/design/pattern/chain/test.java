package tn.design.pattern.chain;

public class test {

	public static void main(String[] args) {

		Chain c1=new AddChain();
		Chain c2=new DivChain();
		Chain c3=new MultChain();
		
		c1.nextChain(c2);
		c2.nextChain(c3);
		//c3.nextChain(c1);
		
		c1.calculate(new Request(4, 4, Opearation.SOUS));
	}
}
