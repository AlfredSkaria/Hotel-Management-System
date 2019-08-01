package org.training.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

//Object relational Model of Customer entity

@Entity
@Table(name="customer")
public class User {

	
	@GeneratedValue(strategy  = GenerationType.AUTO)
    //@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	@NotEmpty(message = "Please provide a name")
	private String name;
	

	@Column(name="username")
	@NotEmpty(message = "Please provide a user name")
	private String username;
	
	@Column(name="phoneno")
	@NotEmpty(message = "Please provide an phone no")
	private String phoneno;
	
	@Id
	@Column(name="email", nullable = false)
	@Email(message="please provide a valid email")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="country")
	@NotEmpty(message = "Please provide an country name")
	private String country;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
}
