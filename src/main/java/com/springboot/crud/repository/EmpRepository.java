package com.springboot.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.crud.dto.Employeedto;
import com.springboot.crud.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long> {

	List<Emp> findByEmpNameIgnoreCase(String empName);
	
	
	  @Query(value = "select * from emp where salary>30000", nativeQuery = true)
	  List<Emp> getSalGt();
	 
	@Query(value="select* from emp where address='chennai'",nativeQuery=true)
	List<Emp>getSalAdd();
	
	 @Query(value="select address, salary from emp",nativeQuery=true)
	List<Employeedto> firstlastname ();


	Object getEmpByName(String string);
	 

	
}
