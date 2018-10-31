package com.cit360.tutorial.hibernate;
 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class SimpleTest {
 
    public static void main(String[] args) {
 
    	
    	
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Student student = new Student();
        student.setName("Sam");
        student.setRoll("103");
        student.setPhone("1121");
        student.setDegree("CITS");
 
        Transaction tx = session.beginTransaction();
        session.save(student);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
        
        
               
    }
}

//https://stackoverflow.com/questions/23214454/org-hibernate-mappingexception-unknown-entity-annotations-users fixed mapping object

