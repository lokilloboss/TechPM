package com.bizpro.techpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import com.bizpro.techpm.IdGenerator;

public class Proyecto {

	@Id
	private String _id;
	private String idProyecto;
	private String idCliente;
	private String nombreProyecto;
	private String descripcion;
	private String detallEstatus;
	
	private String herramientas;
	private String herramienta;
	
	private String estatus;
	private String visible;
	private String recursos;
	private String nombre;
	
	private String conocimientos;
	private String herramientaConocimientos;
	
	private String cambios;
	private String descripcionCambios;
	private String herramientaCambios;
	private String fechaSolicitud;
	private String fechaProductiva;
	private String qSolicito;
	private String qAutorizo;
	
	private String evidencias;
	private String nombreArchivo;
	private String ruta;
	
	private String vobo;
	private String branch;
	private String commit;
	private String estatusVobo;
	
	private String urls;
	private String url;
	private String descripcionUrls;
	
	private String branches;
	private String nombreBranches;
	private String descripcionBranches;
	private String urlBranches;
	private String productiva;

	@PersistenceConstructor
	public Proyecto() {
		this._id = IdGenerator.getId();
		this.setIdProyecto(this._id);
	}

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDetallEstatus() {
		return detallEstatus;
	}

	public void setDetallEstatus(String detallEstatus) {
		this.detallEstatus = detallEstatus;
	}

	public String getHerramientas() {
		return herramientas;
	}

	public void setHerramientas(String herramientas) {
		this.herramientas = herramientas;
	}

	public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getRecursos() {
		return recursos;
	}

	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}

	public String getHerramientaConocimientos() {
		return herramientaConocimientos;
	}

	public void setHerramientaConocimientos(String herramientaConocimientos) {
		this.herramientaConocimientos = herramientaConocimientos;
	}

	public String getCambios() {
		return cambios;
	}

	public void setCambios(String cambios) {
		this.cambios = cambios;
	}

	public String getDescripcionCambios() {
		return descripcionCambios;
	}

	public void setDescripcionCambios(String descripcionCambios) {
		this.descripcionCambios = descripcionCambios;
	}

	public String getHerramientaCambios() {
		return herramientaCambios;
	}

	public void setHerramientaCambios(String herramientaCambios) {
		this.herramientaCambios = herramientaCambios;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getFechaProductiva() {
		return fechaProductiva;
	}

	public void setFechaProductiva(String fechaProductiva) {
		this.fechaProductiva = fechaProductiva;
	}

	public String getqSolicito() {
		return qSolicito;
	}

	public void setqSolicito(String qSolicito) {
		this.qSolicito = qSolicito;
	}

	public String getqAutorizo() {
		return qAutorizo;
	}

	public void setqAutorizo(String qAutorizo) {
		this.qAutorizo = qAutorizo;
	}

	public String getEvidencias() {
		return evidencias;
	}

	public void setEvidencias(String evidencias) {
		this.evidencias = evidencias;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getVobo() {
		return vobo;
	}

	public void setVobo(String vobo) {
		this.vobo = vobo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCommit() {
		return commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

	public String getEstatusVobo() {
		return estatusVobo;
	}

	public void setEstatusVobo(String estatusVobo) {
		this.estatusVobo = estatusVobo;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescripcionUrls() {
		return descripcionUrls;
	}

	public void setDescripcionUrls(String descripcionUrls) {
		this.descripcionUrls = descripcionUrls;
	}

	public String getBranches() {
		return branches;
	}

	public void setBranches(String branches) {
		this.branches = branches;
	}

	public String getNombreBranches() {
		return nombreBranches;
	}

	public void setNombreBranches(String nombreBranches) {
		this.nombreBranches = nombreBranches;
	}

	public String getDescripcionBranches() {
		return descripcionBranches;
	}

	public void setDescripcionBranches(String descripcionBranches) {
		this.descripcionBranches = descripcionBranches;
	}

	public String getUrlBranches() {
		return urlBranches;
	}

	public void setUrlBranches(String urlBranches) {
		this.urlBranches = urlBranches;
	}

	public String getProductiva() {
		return productiva;
	}

	public void setProductiva(String productiva) {
		this.productiva = productiva;
	}
	
}
