package tn.design.pattern.chain;
 

public interface Chain {

	void nextChain(Chain chain);
	
	void calculate(Request request);
	
}
