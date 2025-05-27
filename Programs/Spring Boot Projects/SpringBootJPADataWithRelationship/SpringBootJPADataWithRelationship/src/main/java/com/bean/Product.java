package com.bean;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Component
@Scope("prototype")
@Entity
public class Product {
@Id
private int pid;
private String pname;
private float price;
@OneToMany
@JoinColumn(name = "pid")   // link to orders table pk it must be FK
private List<Orders> listoforders;

public List<Orders> getListoforders() {
	return listoforders;
}
public void setListoforders(List<Orders> listoforders) {
	this.listoforders = listoforders;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
