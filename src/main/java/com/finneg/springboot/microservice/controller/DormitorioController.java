package com.finneg.springboot.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finneg.springboot.microservice.model.Dormitorio;
import com.finneg.springboot.microservice.service.DormitorioService;

@RestController
public class DormitorioController {

	@Autowired
	private DormitorioService dormitorioService;
	
	@GetMapping(value = "dormitorio/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Dormitorio get(@PathVariable Long id) throws Exception {
		return dormitorioService.get(id);
	}
	
	@PostMapping(value = "dormitorio", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Dormitorio post(@RequestBody Dormitorio dormitorio) {
		return dormitorioService.create(dormitorio);
	}
	
	@PutMapping(value = "dormitorio/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Dormitorio put(@PathVariable Long id,@RequestBody Dormitorio dormitorio) {
		dormitorio.setId(id);
		return dormitorioService.update(dormitorio);
	}
	
	@DeleteMapping(value = "dormitorio/{id}")
	public void delete(@PathVariable Long id) {
		dormitorioService.delete(id);
	}
	
	@GetMapping(value = "dormitorio/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Dormitorio> getList(){
		return dormitorioService.getList();
	}
}
