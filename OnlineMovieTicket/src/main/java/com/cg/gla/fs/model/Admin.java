package com.cg.gla.fs.model;
import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="admin")
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="ADMIN_ID" ,nullable=false , unique=true)
private int adminid;
@Column(name="ADMIN_NAME")
private String adminname;
@Column(name="ADMIN_PASSWORD")
private String adminpassword;
@Temporal(value=TemporalType.TIMESTAMP)
private Date date;
@Column(name="ADMIN_CONTACT")
private String admincontact;
public int getAdminid() {
	return adminid;
}
public void setAdminid(int adminid) {
	this.adminid = adminid;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getAdmincontact() {
	return admincontact;
}
public void setAdmincontact(String admincontact) {
	this.admincontact = admincontact;
}
	
}
