package Sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
    SessionFactory sf=cfg.buildSessionFactory();
    Session session=sf.openSession();
    
    //get and Load method
    //to get object from DB , no need to begin the Trasanction 
    
    //get Method Example
    StudentBean stdata=session.get(StudentBean.class, 700);
    System.out.println(stdata);
    StudentBean stnodata=session.get(StudentBean.class, 10);//if data is  not thiere means it will return null 
    System.out.println(stnodata);
    
    
    //load method
    System.out.println("load object");
    StudentBean stload=session.load(StudentBean.class, 700);
    StudentBean stload2=session.load(StudentBean.class, 700);
    System.out.println(stload.getName());
    System.out.println(stload2.getName());
//    System.out.println(stload);
  //if data is  not thiere means it will return  org.hibernate.ObjectNotFoundException
//    StudentBean stnoload=session.load(StudentBean.class, 10);
//    System.out.println(stnoload);
    
    sf.close();
    
    
}
}
