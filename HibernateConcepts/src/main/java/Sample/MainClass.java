package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
public static void main(String[] args) throws IOException {
	System.out.println("project Started");
	
	Configuration cfg=new Configuration();
	cfg.configure();
	 SessionFactory sf=cfg.buildSessionFactory();
	 Session session=sf.openSession();
	 Transaction tx=session.beginTransaction();
	    
	Student_Address std=new Student_Address();
	std.setCity("Sankeshawer");
    std.setStreet("Kamatnur");
    std.setX(2000);
    std.setAddeddate(new Date());
    std.setNextdate(new Date());
    
    StudentBean st =new StudentBean();
    st.setId(700);
    st.setName("Krishna");
	session.save(st);
	
	
   //storing image into DB..
   FileInputStream fileinput=new FileInputStream("src/main/java/pic_demo.png");
   byte[] file=new byte[fileinput.available()];
   fileinput.read(file);
   std.setImg(file);
   
    session.save(std);
    tx.commit();
    System.out.println("project completed");
    session.close();
    
}
}
