package com.db.kudosEmojis.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="users")
public class User {
	
	@Id
	private String userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private int userPoints;
}
