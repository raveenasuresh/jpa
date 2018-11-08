package sample;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class createStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("sample"
				+ ""
				+ "");
		EntityManager entitymanager = emFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		// new student();
//		student.setId(007);
//		student.setEname("rav");
//		student.setFee(100000);
//		student.setNum(985544);
//		student.setId(100);
//		student.setEname("ra");
//		student.setFee(10000);
//		student.setNum(98544);
//		
		
		 student student =entitymanager.find(student.class,007);
	    //entitymanager.rse(student.class);
		
		System.out.println(student);
		student.setFee(6000);
		entitymanager.getTransaction().commit();
		
		System.out.println(student);
		entitymanager.close();
		
		//entitymanager.close();
		//emFactory.close();
		
	}

}