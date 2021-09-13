package com.finneg.springboot.microservice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.finneg.springboot.microservice.model.Dormitorio;

@Repository
public class DormitorioDaoImpl implements DormitorioDao{
	
	private List<Dormitorio> listaDormitorio;
	
	@PostConstruct
	public void init() {
		listaDormitorio = new ArrayList<Dormitorio>();
		listaDormitorio.add(new Dormitorio(1L,"Dormitorio Principal","COD-A1","5x4","Queen","Rojo",true));
		listaDormitorio.add(new Dormitorio(2L,"Dormitorio Chico","COD-B1","3x2","Sommier","Azul",false));
		listaDormitorio.add(new Dormitorio(3L,"Dormitorio Verde","COD-C1","3x3","Futon","Verde",true));
	}

	@Override
	public Dormitorio get(Long id) {
		Optional<Dormitorio> optDormitorio =  listaDormitorio.stream().filter(
				dormi -> id.equals(dormi.getId())).findFirst();
		return optDormitorio.isPresent() ? optDormitorio.get() : null;
	}

	@Override
	public Dormitorio create(Dormitorio dormitorio) {
		Long lastId = listaDormitorio.stream().mapToLong(dormi -> dormi.getId()).max().getAsLong();
		dormitorio.setId(lastId + 1L);
		listaDormitorio.add(dormitorio);
		return dormitorio;
	}

	@Override
	public Dormitorio update(Dormitorio dormitorio) {
		Optional<Dormitorio> optDormitorio =  listaDormitorio.stream().filter(
				dormi -> dormitorio.getId().equals(dormi.getId())).findFirst()
				.map(d -> {listaDormitorio.remove(d);
				return d;});
		if(optDormitorio.isPresent()) {
			listaDormitorio.add(dormitorio);
			return dormitorio;
		}
		return null;
	}
	
	@Override
	public void delete(Long id) {
		listaDormitorio.stream().filter(
				dormi -> id.equals(dormi.getId())).findFirst()
				.map(d -> listaDormitorio.remove(d));
	}

	@Override
	public List<Dormitorio> getList() {
		return listaDormitorio;
	}

}
