package com.todo.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "NOTES")
public class NoteTodo {

	@Id
	private int id;

	@Column(name = "NOTES_TITLE")
	private String title;

	@Column(name = "NOTES_DESCRIPTION",length = 5000)
	private String description;

	@Column(name = "NOTES_DATE")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@ManyToOne
	private User user;
	
	public NoteTodo() {
		super();
	}

	public NoteTodo(String title, String description, Date addedDate) {
		super();
		this.id = new Random().nextInt(1000);
		this.title = title;
		this.description = description;
		this.addedDate = addedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	

}
