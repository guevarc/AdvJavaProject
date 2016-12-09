/**
 * 
 */
package fr.tbr.iamcore.datamodel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

/**
 * @author tbrou
 * Class that implements the data model used for the identities.
 *
 */

@Entity
@Table(name="IDENTITIES")
public class Identity {
	
	@Id
	@GeneratedValue
	long id;
	

	private String displayName;
	private String email;
	private String uid;
	private Date birthDate;
	private String username;
	private String password;
	
	
	/**
	 * Default Constructor
	 */
	public Identity() {
	}
	
	/**
	 * @param displayName
	 * @param email
	 * @param uid
	 */
	public Identity(String displayName, String email, String uid) {
		this.displayName = displayName;
		this.email = email;
		this.uid = uid;
	}
	
	/**
	 * @param id
	 * @param displayName
	 * @param email
	 * @param uid
	 */
	public Identity(long id,String displayName, String email, String uid) {
		this.id = id;
		this.displayName = displayName;
		this.email = email;
		this.uid = uid;
	}
	
	/**
	 * @param displayName
	 * @param email
	 * @param uid
	 * @param username
	 * @param password
	 */
	public Identity(String displayName, String email, String uid, String username, String password) {
		this.displayName = displayName;
		this.email = email;
		this.uid = uid;
		this.username = username;
		this.password = password;
	}
	
	
	
	/**
	 * @param username
	 * @param password
	 */
	public Identity(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Identity [displayName=" + displayName + ", email=" + email
				+ ", uid=" + uid + "]";
	}

	/**
	 * @param date
	 */
	public void setBirthDate(Date date) {
		this.birthDate = date;
		
	}

	/**
	 * @return the birthDate
	 */
	public final Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
