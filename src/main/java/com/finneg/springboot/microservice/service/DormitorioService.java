package com.finneg.springboot.microservice.service;

import java.util.List;

import com.finneg.springboot.microservice.model.Dormitorio;

public interface DormitorioService {
	
	public Dormitorio get(Long id) throws Exception;
	public Dormitorio create(Dormitorio dormitorio);
	public Dormitorio update(Dormitorio dormitorio);
	public void delete(Long id);
	public List<Dormitorio> getList();

}
