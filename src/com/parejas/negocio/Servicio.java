package com.parejas.negocio;

import java.util.List;

import com.parejas.entidades.Persona;

public interface Servicio {
	public void nuevoCliente(Persona cliente);
	public Persona cargarCliente(Integer id);
	public Persona ideal(Persona persona);
	public List<Persona> afines(Persona persona);
}
