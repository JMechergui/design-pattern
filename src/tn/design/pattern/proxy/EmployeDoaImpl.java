package tn.design.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class EmployeDoaImpl implements Dao {

	List<Employe> list;

	@Override
	public void add(Employe employe) {

		if (list == null)
			list = new ArrayList<>();

		list.add(employe);

		System.out.println("List size : " + list.size());
	}

	@Override
	public void remove(Employe employe) {

		if (list != null)
			list.remove(employe);
		System.out.println("List size : " + list.size());
	}

	@Override
	public Employe get(Long id) {

		if (list != null) {
			for (Employe employe : list) {

				if (employe.getId() == id)
					return employe;
			}
		}

		return null;
	}

}
