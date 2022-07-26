package com.sample.sampledata;

import java.util.List;

public interface ServiceInterface {
	public EmployeeTable set(Integer id, double salary);
	public List<EmployeeTable> fetchDes();
	public String push(EmployeeTable d) throws custexception2 ;

}