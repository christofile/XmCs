package Annot;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import L2S3.Student;

public class Anno {
	public static void main(String [] args) {		

		StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu = new Student();
		stu.setStudent_id(3);
		stu.setStudent_FirstName("Kevin");
		stu.setStudent_LastName("Li");
		stu.setStudent_email("kevin.li@citrix.com");
		stu.setStudent_phone(48533);
		
		session.save(stu);
		tx.commit();
		session.close();
		sessionFactory.close();
	
	}
}
