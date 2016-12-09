package fr.tbr.iamcore.service.authentication;


import java.util.Collection;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.datamodel.user;

public class AuthenticationService {
	

	@Inject
	SessionFactory sf;
	
	@Autowired(required = true)
	private SessionFactory sessionFactory;
	
	private static final IAMLogger logger = IAMLogManager.getIAMLogger(AuthenticationService.class);

	public boolean authenticate(String username, String password){
	//public boolean authenticate(user user){
		/*
		user newUser = new user(username, password);
	
		String hqlString = "from user as user where user.username = :uUsername and user.password = :uPassword";
		//Assert.assertNotNull(sf);
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hqlString);
		query.setParameter("uUsername", newUser.getLogin());
		query.setParameter("uPassword", newUser.getPassword());
		
		

		
		logger.info("<= idk" );
		logger.info(newUser.getLogin());
		//return (Collection<Identity>) query.list();
		
		/*
		if (username.equals(databaseUsername) && password.equals(databasePassword)) {
	        System.out.println("Successful Login!\n----");
	        return true;
	    } else {
	        System.out.println("Incorrect Password\n----");
	        return false;
	    }
	    //*/
		
		
		/*
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(user.class); 
		Criterion rest1= Restrictions.and(Restrictions.eq("username",user.getLogin()), 
				Restrictions.eq("password",user.getPassword()));

		criteria.add(rest1);
		user userFromDb =(user) criteria.uniqueResult();
		if(userFromDb != null)
		{
			//user.setId(userFromDb.getId());
			logger.info("say something");
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		
		return true;
	}

}
