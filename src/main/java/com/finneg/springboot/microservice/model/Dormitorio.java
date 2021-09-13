package com.finneg.springboot.microservice.model;

public class Dormitorio {
	
	private Long id;
	private String nombre;
	private String codigo;
	private String medidas;
	private String tipoCama;
	private String color;
	private boolean ventana;
	
	public Dormitorio(Long id, String nombre, String codigo, String medidas, String tipo, String color,
			boolean ventana) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.medidas = medidas;
		this.tipoCama = tipo;
		this.color = color;
		this.ventana = ventana;
	}
	
	public Dormitorio() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}
	public String getTipoCama() {
		return tipoCama;
	}
	public void setTipoCama(String tipo) {
		this.tipoCama = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isVentana() {
		return ventana;
	}

	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}

}
