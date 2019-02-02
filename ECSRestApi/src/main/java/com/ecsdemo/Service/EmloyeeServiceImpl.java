package com.ecsdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecsdemo.Dao.employeeDao;
import com.ecsdemo.Pojo.employee;

@Service
public class EmloyeeServiceImpl implements EmployeeService {

	@Autowired
	employeeDao employeeDao;
	@Override
	public List<employee> getEmployee() {
		return employeeDao.getEmployee();
	}


}
