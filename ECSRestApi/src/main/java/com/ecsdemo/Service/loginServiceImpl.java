package com.ecsdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecsdemo.Pojo.login ;
import com.ecsdemo.Dao.LoginDao;

@Service
public class loginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;
	@Override
	public boolean login(login login) {
		// TODO Auto-generated method stub
		return dao.login(login);
	}

	@Override
	public String generateToken() {
		// TODO Auto-generated method stub
		return null;
	}

}
