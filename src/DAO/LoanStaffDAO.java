package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoanStaffVO;


public class LoanStaffDAO {

	public void insert(LoanStaffVO lsv) {
		// TODO Auto-generated method stub
		
		try
    	{	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(lsv);
    		
    		transaction.commit();
    		session.close();
    		
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
		
	}
	
}
