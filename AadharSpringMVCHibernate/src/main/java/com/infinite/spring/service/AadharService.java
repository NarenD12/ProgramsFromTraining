package com.infinite.spring.service;

import java.util.List;

import com.infinite.spring.pojo.Aadhar;

public interface AadharService {

	public void addAadhar(Aadhar a);
	public void updateAadhar(Aadhar a);
	public List<Aadhar> listAadhar();
	public Aadhar getAadharById(int id);
	public void removeAadhar(int id);

}
