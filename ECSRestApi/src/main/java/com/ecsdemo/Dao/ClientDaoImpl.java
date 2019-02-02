package com.ecsdemo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecsdemo.Pojo.client;

@Repository
public class ClientDaoImpl implements clientDao {

	@Override
	public List<client> getClient() {
		List<client> clientList = new ArrayList<client>();
		
		clientList.add(new client(1,"fuji","ris"));
		clientList.add(new client(2,"kdfwfb","mobile"));
		clientList.add(new client(3,"kims","yasssi"));
		return clientList;
	}

	

}
