package com.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Enrollment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String coursename;
	private String courseid;
	private String enrolleddate;
	private String enrolledusername;
	private String enrolleduserid;
	private String enrolledusertype;
	private String instructorname;
	private String instructorinstitution;
	private String enrolledcount;
	private String youtubeurl;
	private String websiteurl;
	private String coursetype;
	private String skilllevel;
	private String language;
	private String description;
	

}