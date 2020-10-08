package tn.design.pattern.observer;

import java.util.List;

public interface Subscriber {

	/**
	 * 
	 * @param message
	 */
	void addMessage(String message);

	/**
	 * 
	 * @return
	 */
	List<String> getMessages();
}
