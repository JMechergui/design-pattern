package tn.design.pattern.iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LyonPark lyonPark=new LyonPark();
		lyonPark.addCar("1");
		lyonPark.addCar("11");
		lyonPark.addCar("111");
		lyonPark.addCar("1111");
		ParisPark parisPark=new ParisPark();
		parisPark.addCar("2");
		parisPark.addCar("22");
		parisPark.addCar("222");
		parisPark.addCar("22222");
		
		Park park =new Park(lyonPark, parisPark);
		park.displayParkContent();
		
		
	}

}
