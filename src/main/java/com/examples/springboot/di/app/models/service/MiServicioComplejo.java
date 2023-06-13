package com.examples.springboot.di.app.models.service;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("miServicioComplejo")
//@Service //semantica

public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		
		return "Ejecutando algun proceso importante complicado...";
		
	}
}
