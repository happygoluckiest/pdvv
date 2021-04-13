package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;







@Entity
@Table(name="publication")
public class Note implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nameP;
private String nameC;
private String age;
@Temporal(TemporalType.TIMESTAMP)
private Date dateofbr;
private String status;
private String gender;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNameP() {
	return nameP;
}
public void setNameP(String nameP) {
	this.nameP = nameP;
}
public String getNameC() {
	return nameC;
}
public void setNameC(String nameC) {
	this.nameC = nameC;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Date getDateofbr() {
	return dateofbr;
}
public void setDateofbr(Date dateofbr) {
	this.dateofbr = dateofbr;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void addNote(Note note) {
	// TODO Auto-generated method stub
	
}

}