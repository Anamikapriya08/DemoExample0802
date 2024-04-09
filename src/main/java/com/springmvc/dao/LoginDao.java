package com.springmvc.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.springmvc.model.LoginModel;
public class LoginDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public boolean validator(LoginModel login) {
		try {
			Session session=sf.openSession();
			LoginModel lgdb=(LoginModel)session.load(LoginModel.class, login.getUserName());
			session.close();
			if(lgdb!=null && lgdb.getPassword().equals(login.getPassword())) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception e) {
			return false;
		}
	}
}
