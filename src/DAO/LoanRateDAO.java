package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoanRateVO;

public class LoanRateDAO {

	public static List searchType() {
		// TODO Auto-generated method stub
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

	public void insert(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		try
    	{	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(loanRateVO);
    		
    		transaction.commit();
    		session.close();
    		
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}

	public List searchLoanRate(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		List ls = new ArrayList<>();
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    		
    		Session session = sessionfactory.openSession();
    		
    		Query q = session.createQuery("from LoanRateVO");
    		
    		ls = q.list();
    		
    		session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	public void deleteLoanType(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(loanRateVO);
			
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public List editLoanRate(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Query q = session.createQuery("from LoanRateVO where id="+loanRateVO.getId());
		
		
		
		List ls = q.list();
		
		
		return ls;
	}

	public void updateLoanRate(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(loanRateVO);
		
		transaction.commit();
		session.close();
	}

}
