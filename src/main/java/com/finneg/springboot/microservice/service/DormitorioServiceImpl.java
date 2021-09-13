package com.finneg.springboot.microservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finneg.springboot.microservice.dao.DormitorioDaoImpl;
import com.finneg.springboot.microservice.model.Dormitorio;

@Service
public class DormitorioServiceImpl implements DormitorioService {
	
	@Autowired
	DormitorioDaoImpl dormitorioDao;
	
	@Override
	public Dormitorio get(Long id) throws Exception {
		Dormitorio dormitorioEncontrado = dormitorioDao.get(id);
		if(dormitorioEncontrado == null) {
			throw new Exception("Dormitorio no encontrado");
		}
		return dormitorioEncontrado;
	}

	@Override
	public Dormitorio create(Dormitorio dormitorio) {
		return dormitorioDao.create(dormitorio);
	}
	
	@Override
	public Dormitorio update(Dormitorio dormitorio) {
		return dormitorioDao.update(dormitorio);
	}

	@Override
	public void delete(Long id) {
		dormitorioDao.delete(id);
	}

	@Override
	public List<Dormitorio> getList() {
		return dormitorioDao.getList();
	}

}
