package com.todo.entity;

import java.util.List;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User_Registration")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "First_Name")
	private String fname;

	@Column(name = "Last_Name")
	private String lname;

	@Column(name = "Email", unique = true)
	private String email;

	@Column(name = "Password")
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<NoteTodo> notes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public User() {
		super();
	}

	public List<NoteTodo> getNotes() {
		return notes;
	}

	public void setNotes(List<NoteTodo> notes) {
		this.notes = notes;
	}

//	public User(int id, String fname, String lname, String email, String password, List<NoteTodo> notes) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.email = email;
//		this.password = password;
//		this.notes = notes;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
//				+ password + ", notes=" + notes + "]";
//	}

	
	
	
	
	public User(String fname, String lname, String email, String password) {
		super();
		this.id = new Random().nextInt();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + "]";
	}


	
	

}
