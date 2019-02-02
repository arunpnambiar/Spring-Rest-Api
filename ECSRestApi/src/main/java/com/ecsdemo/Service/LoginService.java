package com.ecsdemo.Service;
import  com.ecsdemo.Pojo.login;
public interface LoginService {
	
	public boolean login(login login);
	public String generateToken();

}
