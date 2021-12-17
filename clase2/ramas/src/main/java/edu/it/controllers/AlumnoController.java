package edu.it.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.it.components.Utiles;
import edu.it.entities.Alumno;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/alumno")
@Slf4j
public class AlumnoController {
	
	@Autowired
	Utiles utiles;
	
	@RequestMapping(path="/inventar", method=RequestMethod.GET)
	public Alumno inventarAlumno() {
		return utiles.generarAlumnoRandom();
	}
	
	@GetMapping(path="/env")
	public String variableEntorno() {
		return System.getenv("instancia");
	}
}
