package com.example.demo;


public class RegistrationForm {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmpassword;
	private String gender;




	public RegistrationForm() {
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

}
