package com.ecsdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecsdemo.Dao.ProjectDao;
import com.ecsdemo.Pojo.project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao projectDao;
	@Override
	public List<project> getProject() {
		return projectDao.getProject();
	}

}
