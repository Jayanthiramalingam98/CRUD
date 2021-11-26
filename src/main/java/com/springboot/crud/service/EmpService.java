package com.springboot.crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.dto.Employeedto;
import com.springboot.crud.entity.Emp;
import com.springboot.crud.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository repo;

	public Emp saveEmp(Emp emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	 public List<Emp> getAllEmployees() {
        List<Emp> empList = repo.findAll();
        return empList;
    }

	 public Emp getEmpById(Long empId) {
		/*
		 * if(emp.isPresent()) return emp.get(); else return new
		 * Emp(empId,"No Name Found", -100, "No Address Found");
		 */
		return repo.findById(empId).orElse(null);
    }

	  public List<Emp> getEmpByName(String empName) {
        List<Emp> empList = repo.findByEmpNameIgnoreCase(empName);
        return empList;
    }

	 public Emp updateEmp(Emp emp) {
        Emp updatedEmp = repo.save(emp);
        return updatedEmp;
    }

	
    public List<Emp> deleteEmp(Long empId) {
        repo.deleteById(empId);
        List<Emp> empList = repo.findAll();
        return empList;
    }

	
	
	  public List<Emp> getSal() { // TODO Auto-generated method stub return return
	  return repo.getSalGt(); }
	 
	  public List<Emp> getSalAdd() { // TODO Auto-generated method stub return
		  return repo.getSalAdd(); 
		  }
	 
	 
	

	public List<Employeedto> firstlastname() {
		// TODO Auto-generated method stub
		return repo.firstlastname();
	}
	  

}
