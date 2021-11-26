package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.dto.Employeedto;
import com.springboot.crud.entity.Emp;
import com.springboot.crud.service.EmpService;

@RestController
@RequestMapping("/emp")

public class EmpController {
	
	@Autowired
	EmpService service;
	
	
	@PostMapping("/save")
	public Emp saveEmp(@RequestBody Emp emp) {
		
		return service.saveEmp(emp);
		
	}@GetMapping("/getall")
    public List<Emp> getAllEmployees(){

        List<Emp> empList = service.getAllEmployees();
        return empList;

    }
	 @GetMapping("/get/{empId}")
	// @RequestMapping(value = "/get/{empId}", method = RequestMethod.GET)
	    public Emp geEmpById(@PathVariable Long empId){
	        Emp e = service.getEmpById(empId);
	        return e;
	    }
	 @RequestMapping(value = "/getbyname/{empName}", method = RequestMethod.GET)
	    public List<Emp> geEmpByName(@PathVariable String  empName){
	        List<Emp> empList = service.getEmpByName(empName);
	        return empList;
	    }
	
	 @PutMapping("/update")
	    public Emp updateEmp(@RequestBody Emp emp){

	        Emp updatedEmp = service.updateEmp(emp);
	        return updatedEmp;

	    }
	   @DeleteMapping("/delete/{empId}")
	    public List<Emp> deleteEmp(@PathVariable Long empId){
	        List<Emp> empList = service.deleteEmp(empId);
	        return empList;
	    }
	   
		
		  @GetMapping("/getsal") public List<Emp> getSal(){
		  
		  return service.getSal();
		  
		  }

		  @GetMapping("/getAdd") public List<Emp> getSalAdd(){
		  
		  return service.getSalAdd();
		  
		  }
		  @GetMapping("/getname") public List<Employeedto> firstlastname(){
			  
			  return service.firstlastname();
			  
			  }
		 
}
