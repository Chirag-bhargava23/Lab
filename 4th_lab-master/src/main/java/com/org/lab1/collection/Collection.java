package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(10, "Shubham",150000.0));
		empList.add(new Employee(20,"Chirag",25000.0));
		empList.add(new Employee(30,"Neha", 35000.0));
		empList.add(new Employee(40,"Krishna",27500.0));
		
		return empList;
	}
}
