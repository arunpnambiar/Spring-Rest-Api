package com.ecsdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecsdemo.Dao.clientDao;
import com.ecsdemo.Pojo.client;

@Service
public class ClentServiceImpl implements ClientService {
	@Autowired
	clientDao clientDao;

	@Override
	public List<client> getClient() {
		return clientDao.getClient();
	}


}
