package tn.design.pattern.observer;
 
public class InstaSub extends SubscriberTemplate implements Subscriber{
 
	
	public InstaSub(int id, String name) {
		super(id, name);
	}

	@Override
	public void addMessage(String message) {
		this.messages.add(message);		
	}

}
