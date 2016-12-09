package fr.tbr.iamcore.service.authentication;




import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;


public class AuthenticationService {
	

	@Inject
	SessionFactory sf;
	
	private static final IAMLogger logger = IAMLogManager.getIAMLogger(AuthenticationService.class);

	public boolean authenticate(String username, String password){

		/*
		Identity newUser = new Identity(username, password);
	
		String hqlString = "from user as user where user.username = :uUsername and user.password = :uPassword";
		//Assert.assertNotNull(sf);
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hqlString);
		query.setParameter("uUsername", newUser.getUsername());
		query.setParameter("uPassword", newUser.getPassword());

		logger.info("<= idk" );
		logger.info(newUser.getPassword());
		logger.info(newUser.getUsername());
		//return (Collection<Identity>) query.list();

		*/
		
		
		
		return true;
	}

}
