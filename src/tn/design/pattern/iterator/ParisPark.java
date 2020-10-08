package tn.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParisPark implements ParkIterator {

	private List<String>list=new ArrayList<>();
	
	public void addCar(String name){
		
		list.add(name);
	}
	
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}
