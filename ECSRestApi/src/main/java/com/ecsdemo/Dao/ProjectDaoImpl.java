package com.ecsdemo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecsdemo.Pojo.project;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@Override
	public List<project> getProject() {
		List<project> projectList = new ArrayList<>();
		projectList.add(new project(1, "Ris", "medical", "C# - Angular"));
		projectList.add(new project(2, "yassasi", "medical", "C# - wpf"));
		projectList.add(new project(3, "mobile", "ecomerse", "Android- java"));
		for(int i=4;i<50;i++)
		{
			projectList.add(new project(i, "mobile"+i, "ecomerse"+i, "Android- java"+i));
		}
		return projectList;
	}

	

}
