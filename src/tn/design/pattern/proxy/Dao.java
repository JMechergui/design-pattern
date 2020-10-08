package tn.design.pattern.proxy;

public interface Dao {

	void add(Employe employe);

	void remove(Employe employe);

	Employe get(Long id);
}
