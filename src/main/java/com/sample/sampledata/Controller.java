package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@Autowired
	service s;
	@PostMapping("/send")
	public String a(@RequestBody EmployeeTable d) throws custexception2 {
		return s.push(d);
	}
	@GetMapping("/fetchDesc")
	public List<EmployeeTable> fetchsalary() {
		return s.fetchDes();
	}
	@GetMapping("/SetSalary/{id}/{salary}")
	public EmployeeTable set(@PathVariable Integer id,@PathVariable double salary) {
		return s.set(id,salary);
	}
}
