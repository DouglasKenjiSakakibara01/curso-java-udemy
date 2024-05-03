package com.projeto2.workshopmongodb.entidades;
import java.io.Serializable;
import java.util.*;

import com.projeto2.workshopmongodb.dto.AuthorDTO;
import com.projeto2.workshopmongodb.dto.CommentDTO;

import jakarta.persistence.Id;

public class Post implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private  AuthorDTO author;

	private List<CommentDTO> comments = new ArrayList<>();
	public Post() {
	}

	public Post(String id, Date date, String title, String body,  AuthorDTO author) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}
}
