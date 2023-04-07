package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.core.style.StylerUtils;

import com.mysql.cj.Query;


import dto.studentdto;

public class studentdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();

	 public void insert( studentdto dto){
	 	entityTransaction.begin();
	 	entityManager.persist(dto);
	 	entityTransaction.commit();

	 }

	 public void deleteData(int id)
	 {
	 	entityTransaction.begin();
	 	
	 	studentdto empdto1=entityManager.find(studentdto.class, id);
	 	entityManager.remove(empdto1);
	 	entityTransaction.commit();
}

	 public List<studentdto> fetchall(){
		 Query query=(Query) entityManager.createQuery("select  data from EmpDto data");
		 return query.getResultlist();
	 }
}
