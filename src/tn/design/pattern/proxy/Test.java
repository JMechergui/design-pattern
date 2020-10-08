package tn.design.pattern.proxy;

public class Test {

	public static void main(String[] args) {

		//onlu user id  has access to DAO
		ProxyDao proxy=new ProxyDao(3L);
		
		Employe employe=new Employe();
		employe.setId(1L);
		employe.setFirstName("jihed");
		employe.setLastName("mechergui");
		
		proxy.add(employe);
		proxy.add(employe);
		proxy.add(employe);
		
		
		System.out.println(proxy.get(1L));


	}

}
