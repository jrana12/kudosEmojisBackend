package com.db.kudosEmojis.dto;


import javax.persistence.Column;
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
@Table(name = "orders")
public class Order {

	@Id  // as a PK   // String ===> varchar 
	@Column(name = "orderId")
	private String orderId;
	private String prodId;
	private String userId;
	private String status;
	private String date;
}