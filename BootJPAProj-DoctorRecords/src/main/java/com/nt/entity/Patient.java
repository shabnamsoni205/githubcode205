package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Patient_Record")  
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Patient implements Serializable {
	@Id  //To make  property as singulr ID property and to map with singular PK column
	//@Column(name="regNo") optional if want to take property name as the column name
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer pid;
	@NonNull
	@Column(length = 20)
	private  String pname;
	@NonNull
	@Column(length = 20)
	private  String paddrs;
	
	@NonNull
	@Column(length = 20)
	private  String email;
	@NonNull
	@Column(length = 20)
	private  Long phno;
	@NonNull
	@Column(length = 20)
	private  Double paasword;

}