package com.cit360.tutorial.hibernate;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveStudent {

    @SuppressWarnings("unchecked")

    public static void main(String[] args) {

        
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
    	
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        try {

            session.beginTransaction();
            List<Student> students = session.createQuery("from Student").list();
            if (students!=null) {
              for (Student student : students) {
                    System.out.println(student.getId() + " - " + student.getName() + " - " + student.getDegree());
                }
              }

          session.getTransaction().commit();
          session.close();
          factory.close();

        }

        catch (HibernateException e) {
           e.printStackTrace();
           session.getTransaction().rollback();

        }

      
    }
}

//https://examples.javacodegeeks.com/enterprise-java/hibernate/retrieve-record-in-hibernate-with-criteria/
