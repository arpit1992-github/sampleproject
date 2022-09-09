package com.bank.dto;


import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class UserRequestDto {

	//@NotNull(message ="First Name should Not be Empty ")
	//@NotEmpty(message ="First Name should Not be Empty ")
	private String firstName;
	private String lastName;
	//@NotEmpty
	//@Size(min=12 ,max=12 ,message="Input length should be 12")
	private String panNo;
	//@NotEmpty
	//@Size(min=10 ,max=10 ,message="Input length should be 12")
	private String regMobNum;
	//@Email
	private String regEmail;
	//@NotEmpty
	private String address;
	
	private LocalDate dob;
	//@NotEmpty
	private String gender;
	//@Size(min=18)
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public UserRequestDto(
			@NotNull(message = "First Name should Not be Empty ") @NotEmpty(message = "First Name should Not be Empty ") String firstName,
			String lastName, @NotEmpty @Size(min = 12, max = 12, message = "Input length should be 12") String panNo,
			@NotEmpty @Size(min = 10, max = 10, message = "Input length should be 12") String regMobNum,
			@Email String regEmail, @NotEmpty String address, LocalDate dob, @NotEmpty String gender,
			@Size(min = 18) int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.panNo = panNo;
		this.regMobNum = regMobNum;
		this.regEmail = regEmail;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getRegMobNum() {
		return regMobNum;
	}
	public void setRegMobNum(String regMobNum) {
		this.regMobNum = regMobNum;
	}
	public String getRegEmail() {
		return regEmail;
	}
	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "UserRequestDto [firstName=" + firstName + ", lastName=" + lastName + ", panNo=" + panNo + ", regMobNum="
				+ regMobNum + ", regEmail=" + regEmail + ", address=" + address + ", dob=" + dob + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, dob, firstName, gender, lastName, panNo, regEmail, regMobNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRequestDto other = (UserRequestDto) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(dob, other.dob)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(panNo, other.panNo)
				&& Objects.equals(regEmail, other.regEmail) && Objects.equals(regMobNum, other.regMobNum);
	}
	
	
	
	 
}
