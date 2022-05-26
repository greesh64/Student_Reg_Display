//package com.prog.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="crudtable")
//public class Student {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//	@Column(name="roll",length = 5,unique = true)
//	private int roll;
//	@Column(name="name",length=20)
//	private String name;
//	@Column(name="address",length=30)
//	private String address;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", address=" + address + "]";
//	}
//
//	
//
//}

package com.prog.entity;
 
 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="crudtable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String fullname;
	private String gender;
	private String dob;
	private String clss;
	private String divsn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getClss() {
		return clss;
	}
	public void setClss(String clss) {
		this.clss = clss;
	}
	
	public String getDivsn() {
		return divsn;
	}
	public void setDivsn(String divsn) {
		this.divsn = divsn;
	}
	
	@Override
	public String toString() {
		return "crudtable [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", dob=" + dob +",clss="+clss+", divsn=" + divsn + "]";
	}
	
	

}

