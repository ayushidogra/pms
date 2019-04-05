package com.cts.policyManagmentSystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.User;
import com.cts.policyManagmentSystem.bean.UserPolicy;


@Repository("policyDAO")
public class PolicyDAOImpl implements PolicyDAO{

	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public String addPolicy(Policy policy) {
		// TODO Auto-generated method stub
		
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		session.save(policy);
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public List<Policy> getAllPolicy() {
		// TODO Auto-generated method stub
		Session session = null;
		  try {
			  System.out.println("hi from getall");
	    	  	String query= "from Policy";
	    		Query<Policy> query2=null;
	    		session = sessionFactory.getCurrentSession();
	    		query2=session.createQuery(query);
	    		List<Policy> policies = query2.getResultList();
	    		if(policies==null)
	    			return null;
	    		else
	    			return policies;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
		return null;
	}
	
	@Transactional
	public List<Policy> getAllPolicyForUser(String userId) {
		// TODO Auto-generated method stub
		Session session = null;
		  try {
			  System.out.println("hi from getall");
	    	  	String query= "from Policy where policyId NOT IN(select policyId from UserPolicy where userId=userId)";
	    		Query<Policy> query2=null;
	    		session = sessionFactory.getCurrentSession();
	    		query2=session.createQuery(query);
	    		List<Policy> policies = query2.getResultList();
	    		if(policies==null)
	    			return null;
	    		else
	    			return policies;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
		return null;
	}

	@Transactional
	public String updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		session.update(policy);
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public Policy getPolicyById(String policyId) {
		// TODO Auto-generated method stub
		Session session = null;
		
		String query= "from Policy where policyId = ?";
		Query<Policy> query2=null;
		try {
			session = sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, policyId);
			Policy policy = query2.getSingleResult();
			if(policy==null)
				return null;
			else
				return policy;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public List<Policy> searchPolicyByValues(String userId, String search_by, String search_value) {
		// TODO Auto-generated method stub
		Session session =null;
		String query;
		if("By Name".equals(search_by)){
		query="from Policy where policyName=? AND policyId NOT IN(select policyId from UserPolicy where userId=userId)";
		org.hibernate.query.Query<Policy> query2 = null;
		session=sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		query2.setParameter(0, search_value);
		List<Policy> list=query2.getResultList();
		return list;
		}
		else if("By Id".equals(search_by)){
	    query="from Policy where policyId=? AND policyId NOT IN(select policyId from UserPolicy where userId=userId)";
	    org.hibernate.query.Query<Policy> query2 = null;
	    session=sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		query2.setParameter(0, search_value);
		List<Policy> list=query2.getResultList();
		return list;
		}
		else if("By Type".equals(search_by)){
		    query="from Policy where policyType=? AND policyId NOT IN(select policyId from UserPolicy where userId=userId)";
		    org.hibernate.query.Query<Policy> query2 = null;
		    session=sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, search_value);
			List<Policy> list=query2.getResultList();
			return list;
		}
		
		else{
		query="from Policy where duration=? AND policyId NOT IN(select policyId from UserPolicy where userId=userId)";
		org.hibernate.query.Query<Policy> query2 = null;
		session=sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		query2.setParameter(0, search_value);
		List<Policy> list=query2.getResultList();
		return list;
		}
	}
	@Transactional
	public List<Policy> allPolicy(String userId) {
		// TODO Auto-generated method stub
		Session session = null;
		  try {
			  System.out.println("hi from getall");
	    	  	String query= "from Policy where policyId IN (select policyId from UserPolicy where userId=?)";
	    		Query<Policy> query2=null;
	    		
	    		session = sessionFactory.getCurrentSession();
	    		query2=session.createQuery(query);
				query2.setParameter(0, userId);

	    		List<Policy> policies = query2.getResultList();
	    		if(policies==null)
	    			return null;
	    		else
	    			return policies;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
		return null;
	}

	@Transactional
	public String removePolicy(String policyId, String userId) {
		// TODO Auto-generated method stub
		Session session=null;
		System.out.println("In DAO " +policyId + userId);
		session= sessionFactory.getCurrentSession();
		try{
			
			String query="from UserPolicy where policyId=? AND userId=?";
			Query<UserPolicy> query2=null;
			query2=session.createQuery(query);
			query2.setParameter(0, policyId);
			query2.setParameter(1, userId);
    		List<UserPolicy> policies = query2.getResultList();
    		for(UserPolicy y : policies)
    		{
    			session.delete(y);

    		
    		}
			 
			 
			 
			 
			 
			 
			/*UserPolicy obj1=new UserPolicy();
			obj1.setPolicyId(policyId);
			obj1.setUserId(userId);
			obj1.setPaymentStatus("Pending");
			//obj1.setSR_No(14);
			System.out.println(obj1);*/
			return "deleted";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Transactional
	public List<String> getPolicyStatus(String userId, String policyId) {
		// TODO Auto-generated method stub
		Session session= null;
		session= sessionFactory.getCurrentSession();
		try{
		String query= "select paymentStatus from UserPolicy where userId=? AND policyId=?"; 
		Query<String> query2=null;
		query2=session.createQuery(query);
		query2.setParameter(0, userId);
		query2.setParameter(1, policyId);
		List<String> a=query2.getResultList();
		System.out.println(a);
		return a;
	}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
}
	
	@Transactional
	public boolean updatePolicyStatus(String policyId, String userId){
		
		System.out.println("In DAO Update"+ policyId + userId);
		Session session=null;
//		String query="update Product SET productStatus=2 where productId=?";

		session = sessionFactory.getCurrentSession();
//		String query="UPDATE UserPolicy SET paymentStatus = 'Paid' WHERE policyId = ? AND userId=?";
//		 Query query1 = session.createQuery(query);
//		//query2=session.createQuery(query);
//		query1.setParameter(0, policyId);
//		query1.setParameter(1, userId);
//		int rowCount = query1.executeUpdate();
//	    System.out.println("Rows affected: " + rowCount);
//
//	    
//	    session.close();
//		return true;
		
		
		
			

	
//		UserPolicy product= session.get(UserPolicy.class, policyId);
//		product=session.get(UserPolicy.class, userId);
//		product.setPaymentStatus("Paid");
//		System.out.println(product);
////		org.hibernate.query.Query<String> query2 = null;
//		session.saveOrUpdate(product);
//	
////		//query2.setParameter(0, productId);
////		//String s=query2.getSingleResult();
//	//	
//////		Query query2 = null;
////		session.createQuery(query);
////		query2.setParameter(0, productId);
////		query2.executeUpdate();
////		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
//		return true;
		
		
		
		
		
		
		
		
		
//		org.hibernate.query.Query<String> query2 = null;
		
//		//query2.setParameter(0, productId);
//		//String s=query2.getSingleResult();
	//	
////		Query query2 = null;
//		session.createQuery(query);
//		query2.setParameter(0, productId);
//		query2.executeUpdate();
//		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
		
		
		
		
		
		
try{
			
			String query="from UserPolicy where policyId=? AND userId=?";
			Query<UserPolicy> query2=null;
			query2=session.createQuery(query);
			query2.setParameter(0, policyId);
			query2.setParameter(1, userId);
    		List<UserPolicy> policies = query2.getResultList();
    		for(UserPolicy y : policies)
    		{
    			y.setPaymentStatus("Paid");
    			session.saveOrUpdate(y);

    		
    		
    		}
    		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
		
}
