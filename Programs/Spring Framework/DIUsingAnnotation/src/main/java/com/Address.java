package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component					// <bean class="com.Address"></bean> by default id is class level using camel naming rule 
public class Address {			// id is address if class is AddressDetails then id is addressDetails
@Value(value = "Hyderbad")
private String city;
@Value(value = "TS")
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
