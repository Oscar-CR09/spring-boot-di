package com.examples.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.examples.springboot.di.app.models.service.IServicio;
//import com.examples.springboot.di.app.models.service.MiServicio;

@Controller
public class indexController {
	
	 // contenedor de spring inyectar un objeto de un atributo
	
	@Autowired
	//@Qualifier("miServicioComplejo")
	private IServicio servicio;

	@GetMapping({"/","","/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto",servicio.operacion());
		return "index";
		
	}


	

}
