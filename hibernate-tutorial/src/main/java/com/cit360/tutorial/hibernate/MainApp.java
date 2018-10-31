package com.cit360.tutorial.hibernate;

import org.hibernate.Session;

import com.cit360.tutorial.util.HibernateUtil;

/**
 * @author imssbora
 */
public class MainApp {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();

    
    String sql = "select name from employee";

    String result = (String) session.createNativeQuery(sql).getSingleResult();
    System.out.println(result);

    session.getTransaction().commit();
    session.close();

    
    HibernateUtil.shutdown();
  }
}