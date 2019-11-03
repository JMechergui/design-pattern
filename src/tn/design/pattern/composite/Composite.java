package tn.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private String name;
	private List<Component> components=new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void description() {
		System.out.println("Composite " + name);


		if (components != null && !components.isEmpty()) {

			for (Component component : components) {
				component.description();
			}
		}

	}

	@Override
	public Float cost() {
		Float cost = 0F;

		if (components != null && !components.isEmpty()) {

			for (Component component : components) {
				cost += component.cost();
			}
		}

		return cost;
	}

	public void addComponent(Component component) {

		if (components == null)
			components = new ArrayList<>();
		
		if (components != null ) {

			components.add(component);
		}
	}
}
