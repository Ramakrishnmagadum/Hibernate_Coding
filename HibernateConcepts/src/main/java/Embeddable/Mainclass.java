package Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public interface Mainclass {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	StudentList st=new StudentList();
	st.setStudentid(101);
	st.setName("ramakrishna");
	Certificate certi=new Certificate();
	certi.setCourse("java");
	certi.setDuration("1 month");
	
	st.setCerti(certi);
	
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(st);
	tx.commit();
	System.out.println("project over");
}
}
