package sample;

import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("project started");
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Scanner sc=new Scanner(System.in);
		System.out.println(" 1. Add \n 2. get \n 3. update \n 4. delete");
		int num=sc.nextInt();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction(); 
//		Query query = session.createQuery("FROM Person WHERE name = :name"); 
		StudentBean st = new StudentBean();
		switch(num)
		{
		case 1:
			{
				st.setId(sc.nextInt());
			    st.setName(sc.next());
				session.save(st);
				tx.commit();
				session.close();
			}
		
		case 2: {
			StudentBean st1=session.get(StudentBean.class, sc.nextInt());
			System.out.println(st1.toString());
		}
		case 3:{
			st.setId(sc.nextInt());
			  st.setName(sc.next());
			  session.update(st);
				tx.commit();
				session.close();
		}
		case 4:
		{
			st.setId(sc.nextInt());
			 session.delete(st);
				tx.commit();
				session.close();
		}
			
		}
		
		

		
	

		System.out.println(sf);
		System.out.println(sf.isOpen());
	}
}
