package com.bean;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto increment 
private int oid;
private Integer pid;    // it can hold null value 	pid must be FK 
private LocalDateTime orderdate;		// current date and time 
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public LocalDateTime getOrderdate() {
	return orderdate;
}
public void setOrderdate(LocalDateTime orderdate) {
	this.orderdate = orderdate;
}

}
