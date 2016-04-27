package com.parejas.entidades;

public class Persona {
	private Integer id;
	private String nombre;
	private Integer edad;
	private Float altura;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(Integer id, String nombre, Integer edad, Float altura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad
				+ ", altura=" + altura + "]";
	}
}
