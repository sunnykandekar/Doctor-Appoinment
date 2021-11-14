package com.Appointment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//details like Name,Age, DOB, Blood Group,Address,Mobile Number,Email,Date of Appointment and upload patient reports in PDF format.
@Entity
@Table(name="patient")
public class patient
{

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int id;
     private String name;
     private String age;
     private String dob;
     private String subject;
     private String body;
     private String bloodgroup;
     private String address;
     private String number;
     private String email;
     private String appointmentdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	
	public patient(int id, String name, String age, String dob, String subject, String body, String bloodgroup,
			String address, String number, String email, String appointmentdate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.subject = subject;
		this.body = body;
		this.bloodgroup = bloodgroup;
		this.address = address;
		this.number = number;
		this.email = email;
		this.appointmentdate = appointmentdate;
		
	}
	public patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "patient [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", subject=" + subject
				+ ", body=" + body + ", bloodgroup=" + bloodgroup + ", address=" + address + ", number=" + number
				+ ", email=" + email + ", appointmentdate=" + appointmentdate + "]";
	}
     
     
  
     

     
}
