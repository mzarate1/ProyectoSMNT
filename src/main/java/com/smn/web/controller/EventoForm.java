/**
 * 
 */
package com.smn.web.controller;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


import com.smn.web.model.Evento;

/**
 * @author alfredo
 *
 */
public class EventoForm {
	
	private Long id_evento;
	
	
	//@FutureOrPresent(message = "VALIDACION Fecha solo puede ser el presente o futuro")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fechaevento;
		
	@NotNull
	@Size(min=2, max=500, message = "La descripción debe tener entre 2 y 500 caracteres")
	private String dsc_evento;
	
	@NotNull
	private Long id_ciudad;

	public EventoForm() {
		super();
	}

public EventoForm(Evento e) {
	super();
	this.id_evento=e.getId_evento();
	this.dsc_evento=e.getdsc_evento();
	this.fechaevento=e.getFechaevento();
	}


	public Long getId_evento() {
		return id_evento;
	}

	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}

	public Date getFechaevento() {
		return fechaevento;
	}

	public void setFechaevento(Date fechaevento) {
		this.fechaevento = fechaevento;
	}

	public String getDsc_evento() {
		return dsc_evento;
	}

	public void setDsc_evento(String dsc_evento) {
		this.dsc_evento = dsc_evento;
	}

	public Long getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(Long id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public Evento toPojos() {
		Evento e = new Evento();
		e.setdsc_evento(this.getDsc_evento());
		e.setFechaevento(this.getFechaevento());
		return e;
	}

	@Override
	public String toString() {
		return "Evento [=" + id_evento + ", fecha=" + fechaevento + ", dsc evento=" + dsc_evento + ", ciudad=" + id_ciudad + "]";
	}
	
}
