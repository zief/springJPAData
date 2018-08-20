package id.cobacrud.demo.springdatajpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="app_user")
public class AppUser {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="join_date")
	private Date joinDate;
	
	@Override
	public String toString() {
		return String.format(""
				+ "AppUser[id=%d,username=%s,firstName=%s,lastName=%s,joinDate=%tD]",
				id, username, firstName, lastName, joinDate);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date date) {
		this.joinDate = date;
	}
	
	
	
}
