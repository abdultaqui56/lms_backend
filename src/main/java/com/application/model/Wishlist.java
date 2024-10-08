package com.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist 
{
	@Id
	private String coursename;
	private String courseid;
	private String likeduser;
	private String likedusertype;
	private String instructorname;
	private String instructorinstitution;
	private String enrolledcount;
	private String coursetype;
	private String websiteurl;
	private String skilllevel;
	private String language;
	private String description;
}
