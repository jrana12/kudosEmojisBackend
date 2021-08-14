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
@Table(name = "products")
public class Product {

	@Id  // as a PK   // String ===> varchar 
	@Column(name = "productId")
	private String pId;
	private String prodName;
	private int prodPrice;
	private String prodUrl;
	private String prodDesc;
}