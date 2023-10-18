package com.infinite.spring.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.spring.dao.AadharDAO;
import com.infinite.spring.pojo.Aadhar;

@Service
public class AadharServiceImpl implements AadharService {

	private AadharDAO aadharDAO;

	public void setAadharDAO(AadharDAO aadharDAO) {
		this.aadharDAO = aadharDAO;
	}
	
	@Override
	@Transactional
	public void addAadhar(Aadhar a) {
		this.aadharDAO.addAadhar(a);
	}

	@Override
	@Transactional
	public void updateAadhar(Aadhar a) {
		this.aadharDAO.updateAadhar(a);
	}

	@Override
	@Transactional
	public List<Aadhar> listAadhar() {
		return this.aadharDAO.listAadhar();
	}

	@Override
	@Transactional
	public Aadhar getAadharById(int id) {
		return this.aadharDAO.getAadharById(id);
	}

	@Override
	@Transactional
	public void removeAadhar(int id) {
		this.aadharDAO.removeAadhar(id);
	}	
}
