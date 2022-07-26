package com.sample.sampledata;
import org.springframework.http.ResponseEntity;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
@Component
public class service implements ServiceInterface{
	@Autowired
	JpaDataAccess i;
	@Override
	public List<EmployeeTable> fetchDes() {
		// TODO Auto-generated method stub
		List<EmployeeTable> e = i.findAll();
		Collections.sort(e,(i,j)->i.getSalary()>j.getSalary() ? -1 : i.getSalary()<j.getSalary() ? 1 : i.getName().compareTo(j.getName()));
		return e;
	}
	public String push (EmployeeTable d) throws custexception2{
		if(i.findById(d.getId()).isPresent()) {
			throw new custexception2();	
		}
		else {
			i.save(d);
			return "Successfully added to the database";
		}	
	}	
	public EmployeeTable set(Integer id, double salary) {
		EmployeeTable e=i.findById(id).get();
		e.setSalary(salary);
		i.save(e);
		return i.findById(id).get();
	}
}
