package com.range;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.range.mapping.Address;
import com.range.mapping.Person;
import com.range.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Person p1 = new Person();
        p1.setFirstName("sandeep");
        p1.setLastName("k");
        p1.setAge(25);
        Person p2= new Person();
        p2.setFirstName("raju");
        p2.setLastName("k");
        p2.setAge(25);
        
        Address add=new Address();
        add.setDno("8-3-318");
        add.setStreetName("Alinagar");
        
        long personId = (Long) session.save(p1);
        long personI = (Long) session.save(p2);
        int Addressid=(int)session.save(add);
        
        session.getTransaction().commit();
        
        Person person1 = (Person) session.get(Person.class, personId);        
        System.out.println(person1);
        Person person2 = (Person) session.get(Person.class, personI);        
        System.out.println(person2);
        
        
        Address add1=(Address)session.get(Address.class, Addressid);
        System.out.println(add1);
        session.close();
    }
}