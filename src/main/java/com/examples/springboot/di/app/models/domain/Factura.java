package com.examples.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope // lo que dura una peticion de http si se 
//@SessionScope  // lo que dura la secion time out finaliza 
//@ApplicationScope 

public class Factura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7489247441094979468L;

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private cliente Cliente;
	
	@Autowired
	//@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items;

	@PostConstruct  
	public void inicializar() {
		Cliente.setNombre(Cliente.getNombre().concat(" ").concat(" Cervantes "));
		descripcion = descripcion.concat(" del cliente: ").concat(Cliente.getNombre());
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida: ".concat(descripcion));
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public cliente getCliente() {
		return Cliente;
	}

	public void setCliente(cliente cliente) {
		Cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
