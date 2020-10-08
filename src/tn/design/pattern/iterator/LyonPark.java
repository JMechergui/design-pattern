package tn.design.pattern.iterator;
 
import java.util.Arrays;
import java.util.Iterator; 

public class LyonPark implements ParkIterator {

	int i =0;
	private String []list=new String[100];
	
	public void addCar(String name){
		
		list[i]=name;
		i++;
	}
	
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return  Arrays.asList(list).iterator();
	}

}
