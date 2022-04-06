package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private Integer ID;
@Column(name="name")
private String Name;
@Column(name="description")
private String Description;
@Column(name="brand")
private String Brand;
@Column(name="price")
private float Price;

public Laptop() {
	super();
}

public Laptop(Integer iD, String name, String description, String brand, float price) {
	super();
	ID = iD;
	Name = name;
	Description = description;
	Brand = brand;
	Price = price;
}

public Integer getID() {
	return ID;
}

public void setID(Integer iD) {
	ID = iD;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public String getBrand() {
	return Brand;
}

public void setBrand(String brand) {
	Brand = brand;
}

public float getPrice() {
	return Price;
}

public void setPrice(float price) {
	Price = price;
}

@Override
public String toString() {
	return "Laptop [ID=" + ID + ", Name=" + Name + ", Description=" + Description + ", Brand=" + Brand + ", Price="
			+ Price + "]";
}

}
