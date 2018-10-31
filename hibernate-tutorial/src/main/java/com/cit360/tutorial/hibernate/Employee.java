package com.cit360.tutorial.hibernate;

import java.util.Date;

public class Employee {
	   private int id;
	   private String name; 
	   private String role;   
	   private Date insert_time;  

	   public Employee() {}
	   
	   public Employee(String name, String role, Date insert_time) {
	      this.name = name;
	      this.role = role;
	      this.insert_time = insert_time;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName( String name ) {
	      this.name = name;
	   }
	   
	   public String getRole() {
	      return role;
	   }
	   
	   public void setRole( String role ) {
	      this.role = role;
	   }
	   
	   public Date getInsertTime() {
	      return insert_time;
	   }
	   
	   public void setInsertTime( Date insert_time ) {
	      this.insert_time = insert_time;
	   }
	}
