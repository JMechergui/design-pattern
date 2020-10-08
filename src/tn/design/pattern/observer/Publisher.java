package tn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

	List<Subscriber>subscribers= new ArrayList<>();
	
	public void addSubscriber(Subscriber subscriber){
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber){
			subscribers.remove(subscriber);
	}
	
	public void notify(String message){
		
		for (Subscriber subscriber : subscribers) {
			subscriber.addMessage(message);
		}
	}
}