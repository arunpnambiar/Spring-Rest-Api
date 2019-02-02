package com.ecsdemo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecsdemo.Pojo.employee;

@Repository
public class EmployeeDaoImpl implements employeeDao {

	@Override
	public List<employee> getEmployee() {
		List<employee> empList= new ArrayList<>();
		
		empList.add(new employee(1,"ragesh","development","4"));
		empList.add(new employee(2,"nikhil","development","2"));
		empList.add(new employee(3,"lakshya","HR","6"));
		empList.add(new employee(1,"anu","Project Lead","7"));
		
		return empList;
	}

}
