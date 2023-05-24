package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant {
	
	private String firstName;
	private String lastName;
	private Date DOB;
	private String employment;
	private Integer monthlyRent;
	private String housingStatus;
	private Integer ssn;
	private String email;

}
