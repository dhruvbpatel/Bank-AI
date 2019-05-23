package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoanTypeVO;

public class LoanTypeDAO {

	public void insert(LoanTypeVO loanTypeVO) {
		// TODO Auto-generated method stub
		
		try
    	{	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(loanTypeVO);
    		
    		transaction.commit();
    		session.close();
    		
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
		
	}

	public List searchLoanType(LoanTypeVO loanTypeVO) {
		List ls = new ArrayList<>();
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Query q = session.createQuery("from LoanTypeVO");
    		
    		ls = q.list();
    		
    		session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	
	public List loadLoanType() {
		List ls = new ArrayList<>();
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Query q = session.createQuery("from LoanTypeVO");
    		
    		ls = q.list();
    		
    		session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	public void deleteLoanType(LoanTypeVO loanTypeVO) {
		// TODO Auto-generated method stub
			try {
				SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionfactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.delete(loanTypeVO);
				
				transaction.commit();
				session.close();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	public List editLoanType(LoanTypeVO loanTypeVO) {
		// TODO Auto-generated method stub
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Query q = session.createQuery("from LoanTypeVO where id="+loanTypeVO.getId());
		
		
		
		List ls = q.list();
		
		
		return ls;
	}

	public void updateLoanType(LoanTypeVO loanTypeVO) {
		// TODO Auto-generated method stub
		 SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(loanTypeVO);
			
			transaction.commit();
			session.close();
	}

	
}
