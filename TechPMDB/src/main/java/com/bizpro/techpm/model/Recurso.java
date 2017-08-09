package com.bizpro.techpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import com.bizpro.techpm.IdGenerator;

public class Recurso {

	@Id
	private String _id;
	private String idRecurso;
	private String usuario;
	private String nombre;
	private String proyectos;
	private String proyecto;
	private String conocimientos;
	private String herramienta;
	
	@PersistenceConstructor
	public Recurso() {
		this._id = IdGenerator.getId();
		this.idRecurso = this._id;
	}
	
	public String getIdRecurso() {
		return idRecurso;
	}
	
	public void setIdRecurso(String idRecurso) {
		this.idRecurso = idRecurso;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getProyectos() {
		return proyectos;
	}
	
	public void set_idProyectos(String proyectos) {
		this.proyectos = proyectos;
	}
	
	public String getProyecto() {
		return proyecto;
	}
	
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	
	public String getconocimientos() {
		return conocimientos;
	}
	
	public void set_conocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}
	
	public String getHerramienta() {
		return herramienta;
	}
	
	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}	
	
}
