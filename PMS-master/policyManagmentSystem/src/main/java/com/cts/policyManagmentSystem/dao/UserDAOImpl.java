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
import com.cts.policyManagmentSystem.bean.UserPolicy;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	
	
	
	
	
    
    
    		@Transactional
			public List<Policy> getPolicyByType() {
				// TODO Auto-generated method stub
    			Session session = null;
    	
    				try {
    						String query= "from Policy order by policyType";
    						Query<Policy> query2=null;
      			
    						session = sessionFactory.getCurrentSession();
    						query2=session.createQuery(query);
      				
    						List<Policy> products = query2.getResultList();
    						if(products==null)
    							return null;
    						else
    							return products;
    						} catch (Exception e) {
    							e.printStackTrace();
    						}
				return null;
			}
    
    
    		@Transactional
			public List<Policy> getPolicyById() {
				// TODO Auto-generated method stub
    			
    			Session session = null;
    	    	
				try {
						String query= "from Policy order by policyId";
						Query<Policy> query2=null;
  			
						session = sessionFactory.getCurrentSession();
						query2=session.createQuery(query);
  				
						List<Policy> products = query2.getResultList();
						if(products==null)
							return null;
						else
							return products;
						} catch (Exception e) {
							e.printStackTrace();
						}
				return null;
			}
    		
    		
    		@Transactional
			public List<Policy> getPolicyByYears() {
				// TODO Auto-generated method stub
    			Session session = null;
    	    	
				try {
						String query= "from Policy order by duration";
						Query<Policy> query2=null;
  			
						session = sessionFactory.getCurrentSession();
						query2=session.createQuery(query);
  				
						List<Policy> products = query2.getResultList();
						if(products==null)
							return null;
						else
							return products;
						} catch (Exception e) {
							e.printStackTrace();
						}
				return null;
			}
    @Transactional
			public List<Policy> getPolicyByCompany() {
				// TODO Auto-generated method stub
    	
    	Session session = null;
    	
		try {
				String query= "from Policy order by company";
				Query<Policy> query2=null;
		
				session = sessionFactory.getCurrentSession();
				query2=session.createQuery(query);
			
				List<Policy> products = query2.getResultList();
				if(products==null)
					return null;
				else
					return products;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
    
    
    		@Transactional
			public List<Policy> getPolicyByName() {
				// TODO Auto-generated method stub
    			
    			Session session = null;
    	    	
    			try {
    					String query= "from Policy order by policyName";
    					Query<Policy> query2=null;
    			
    					session = sessionFactory.getCurrentSession();
    					query2=session.createQuery(query);
    				
    					List<Policy> products = query2.getResultList();
    					if(products==null)
    						return null;
    					else
    						return products;
    					} catch (Exception e) {
    						e.printStackTrace();
    					}
				return null;
			}


    		@Transactional
			public String addPolicy(UserPolicy userPolicy, String policyId, String userId) {
				// TODO Auto-generated method stub
    			Session session = null;
    			try {
    			session = sessionFactory.getCurrentSession();
    			
    			session.saveOrUpdate(userPolicy);
    			userPolicy.setPolicyId(policyId);
    			userPolicy.setUserId(userId);
    			userPolicy.setPaymentStatus("Pending");
				return "true";
    			}
    			catch(Exception e)
    			{
    				e.printStackTrace();
    			}
    			return "true";
			}
    
}
