package es.meatze.mantenimiento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/home")
public class ControllerHome {

	@GetMapping(path = "/hola")
	public String saludar() {
		return "index";
		
	}
	
	/*@GetMapping(path="/form")
	public String muestrFormulario() {
		return "formulario";
	}*/
}
