package com.cg.gla.fs.model;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
@Id
@Column(name="CUSTOMER_ID" ,nullable=false)
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int customerid;
@Column(name="CUSTOMER_NAME")
private String customername;
@Column(name="CUSTOMER_PASSWORD")
private String customerpassword;
@Column(name="CUSTOMER_DATEOFBIRTH")
private String dob;
@Column(name="CUSTOMER_CONTACT")
private String customercontact;
@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
private List<Ticket> my_Tickets;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomerpassword() {
	return customerpassword;
}
public void setCustomerpassword(String customerpassword) {
	this.customerpassword = customerpassword;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getCustomercontact() {
	return customercontact;
}
public void setCustomercontact(String customercontact) {
	this.customercontact = customercontact;
}
public List<Ticket> getMy_Tickets() {
	return my_Tickets;
}
public void setMy_Tickets(List<Ticket> my_Tickets) {
	this.my_Tickets = my_Tickets;
}




}
