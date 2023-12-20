//package com.app.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.app.pojos.Department;
//import org.hibernate.SessionFactory;
//
//@Repository
//public class DepartmentDaoImpl implements DepartmentDao {
////depcy
//	@Autowired //autowire=byType
//	private EntityManager manager;
//	@Override
//	public List<Department> getAllDepartments() {
//		String jpql="select d from Department d";
//		return manager
//				.createQuery(jpql, Department.class)
//				.getResultList();
//	}
//
//}
