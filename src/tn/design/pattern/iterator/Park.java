package tn.design.pattern.iterator;

import java.util.Iterator;

public class Park {

	private LyonPark lyonPark;
	private ParisPark parisPark;

	public Park(LyonPark lyonPark, ParisPark parisPark) {
		super();
		this.lyonPark = lyonPark;
		this.parisPark = parisPark;
	}

	public LyonPark getLyonPark() {
		return lyonPark;
	}

	public void setLyonPark(LyonPark lyonPark) {
		this.lyonPark = lyonPark;
	}

	public ParisPark getParisPark() {
		return parisPark;
	}

	public void setParisPark(ParisPark parisPark) {
		this.parisPark = parisPark;
	}

	public void displayParkContent(){
		
		printTheSongs(lyonPark.createIterator());
		printTheSongs(parisPark.createIterator());
	}
	private void printTheSongs(Iterator iterator) {

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
	}

}
