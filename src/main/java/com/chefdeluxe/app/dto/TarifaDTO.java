package com.chefdeluxe.app.dto;

import java.math.BigDecimal;

public class TarifaDTO {
	
	private long id;
	private long  idchef;
	private BigDecimal precioHora;
	private String usernameOrEmail;
	
	private long idMenu;
	private long idChef;
	private String entrante;
	private String primero;
	private String segundo;
	private String postre;
	private String cafes;
	
	
	public long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(long idMenu) {
		this.idMenu = idMenu;
	}
	public long getIdChef() {
		return idChef;
	}
	public void setIdChef(long idChef) {
		this.idChef = idChef;
	}
	public String getEntrante() {
		return entrante;
	}
	public void setEntrante(String entrante) {
		this.entrante = entrante;
	}
	public String getPrimero() {
		return primero;
	}
	public void setPrimero(String primero) {
		this.primero = primero;
	}
	public String getSegundo() {
		return segundo;
	}
	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	public String getCafes() {
		return cafes;
	}
	public void setCafes(String cafes) {
		this.cafes = cafes;
	}
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdchef() {
		return idchef;
	}
	public void setIdchef(long idchef) {
		this.idchef = idchef;
	}
	public BigDecimal getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(BigDecimal precioHora) {
		this.precioHora = precioHora;
	}
	
	
	
	

}
