

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

