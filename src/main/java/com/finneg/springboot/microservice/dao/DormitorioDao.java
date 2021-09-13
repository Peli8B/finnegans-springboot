package com.finneg.springboot.microservice.dao;

import java.util.List;

import com.finneg.springboot.microservice.model.Dormitorio;

public interface DormitorioDao {
	public Dormitorio get(Long id);
	public Dormitorio create(Dormitorio dormitorio);
	public Dormitorio update(Dormitorio dormitorio);
	public void delete(Long id);
	public List<Dormitorio> getList();
}
