package com.example.demo;


import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  
	@Column(nullable =false)
	private String student;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String address;
	
	
    
    private boolean present;
    

    @Column(nullable=false)
    private String status; 

    public Attendance() {
    	
    }

    
	public boolean isPresent() {
		return present;
	}


	public void setPresent(boolean present) {
		this.present = present;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}


    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

   


}
