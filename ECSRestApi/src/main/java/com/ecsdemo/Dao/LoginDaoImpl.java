package com.ecsdemo.Dao;
import org.springframework.stereotype.Repository;

import com.ecsdemo.Pojo.login ;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean login(login login) {
		try {
			if(login.getUsername().equals("admin@gmail.com") && login.getPassword().equals("1"))
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
