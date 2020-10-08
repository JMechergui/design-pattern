package tn.design.pattern.observer;
 

public class FaceBookSub extends SubscriberTemplate  implements Subscriber{
 
	
	public FaceBookSub(int id, String name) {
		super(id, name); 
	}
	
	@Override
	public void addMessage(String message) {
		this.messages.add(message);		
	}

}
