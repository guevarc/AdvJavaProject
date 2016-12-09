package fr.tbr.iamcore.datamodel;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.SessionFactory;

@Entity
@Table(name="USERS")
public class user {
	
	@Id
	@GeneratedValue
	long id;

	
	private String username;
	private String password;


	private SessionFactory sessionFactory;
	
	
	/**
	 * @param username
	 * @param password
	 */
	public user(String username, String password) {
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the login
	 */
	public final String getLogin() {
		return username;
	}
	
	/**
	 * @param login the login to set
	 */
	public final void setLogin(String login) {
		this.username = login;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
