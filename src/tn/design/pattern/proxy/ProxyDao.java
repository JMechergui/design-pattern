package tn.design.pattern.proxy;

public class ProxyDao implements Dao{

	private Long userId;
	
	private Dao employeDao;
	
	 
	public ProxyDao(Long userId ) {
		super();
		this.userId = userId;
		this.employeDao = new EmployeDoaImpl();
	}

	@Override
	public void add(Employe employe) {
		if(userId==1L){
			employeDao.add(employe);
		}else{			
			System.err.println("userId "+userId+" has no access to add method");
		}
		
	}

	@Override
	public void remove(Employe employe) {
		if(userId==1L){
			employeDao.add(employe);
		}else{			
			System.err.println("userId "+userId+" has no access to remove method");
		}
		
	}

	@Override
	public Employe get(Long id) {
		// TODO Auto-generated method stub
		return employeDao.get(id);
	}

}
