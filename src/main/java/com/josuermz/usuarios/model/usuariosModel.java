package com.josuermz.usuarios.model;

public class usuariosModel {

	private int id;
	private String clave;
	private String tipo;
	private String nombre;
	private String username;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String password;
	private String tipoUsuario;
	private String fechaInicioSesion;
	private String fechaFinSesion;
	private String tiempoLinea;
	private String estatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getFechaInicioSesion() {
		return fechaInicioSesion;
	}

	public void setFechaInicioSesion(String fechaInicioSesion) {
		this.fechaInicioSesion = fechaInicioSesion;
	}

	public String getFechaFinSesion() {
		return fechaFinSesion;
	}

	public void setFechaFinSesion(String fechaFinSesion) {
		this.fechaFinSesion = fechaFinSesion;
	}

	public String getTiempoLinea() {
		return tiempoLinea;
	}

	public void setTiempoLinea(String tiempoLinea) {
		this.tiempoLinea = tiempoLinea;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
