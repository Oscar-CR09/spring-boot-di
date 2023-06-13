package com.examples.springboot.di.app.models.service;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("miServicioSimple")
//@Service //semantica
//@Primary
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		
		return "Ejecutando algun proceso importante simple...";
		
	}
}
