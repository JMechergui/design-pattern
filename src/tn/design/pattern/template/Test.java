package tn.design.pattern.template;

public class Test {


	public static void main(String[]args){
		Ecoupe e= new Ecoupe();
		e.assemble();
		
		EBerline e1=new EBerline();
		e1.assemble();
	}
}
