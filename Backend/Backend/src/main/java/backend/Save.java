package backend;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory  factory=Persistence.createEntityManagerFactory("sukumar");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	Employee e1=new Employee(1, "Sukumar", "sukumar@gmail.com", "HR");
	Employee e2=new Employee(2, "Ramu", "ramu@gmail.com", "HR");
	Employee e3=new Employee(3, "Shankar", "shankar@gmail.com", "HR");
	
	Employee e4=new Employee(4, "Shiva", "shiva@gmail.com", "IT");
	Employee e5=new Employee(5, "Singha", "singha@gmail.com", "IT");
	Employee e6=new Employee(6, "Ravi", "ravi@gmail.com", "IT");
	
	
	Employee e7=new Employee(7, "Mouraya", "mouraya@gmail.com", "COMPLIANCE");
	Employee e8=new Employee(8, "Abhishek", "abhishek@gmail.com", "COMPLIANCE");
	Employee e9=new Employee(9, "Rahul", "rahul@gmail.com", "COMPLIANCE");
	
	
	Training t1=new Training(1, "HR Operations");
	Training t2=new Training(2, "Pepole Analytics");
	Training t3=new Training(3, "Software Developer");
	Training t4=new Training(4, "software Tester");
	Training t5=new Training(5, "Laws");
	Training t6=new Training(6, "Rules");
	List<Training> training = Arrays.asList(t1, t2, t3, t4,t5,t6);
	e1.setTraining(training);
	e2.setTraining(training);
	e3.setTraining(training);
	e4.setTraining(training);
	e5.setTraining(training);
	e6.setTraining(training);
	e7.setTraining(training);
	e8.setTraining(training);
	e9.setTraining(training);
	transaction.begin();
	manager.persist(e1);
	manager.persist(e2);
	manager.persist(e3);
	manager.persist(e4);
	manager.persist(e5);
	manager.persist(e6);
	manager.persist(e7);
	manager.persist(e8);
	manager.persist(e9);
	manager.persist(t1);
	manager.persist(t2);
	manager.persist(t1);
	manager.persist(t3);
	manager.persist(t4);
	manager.persist(t5);
	manager.persist(t6);
	transaction.commit();
}
}
