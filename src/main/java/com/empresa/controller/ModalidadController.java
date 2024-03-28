package com.empresa.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Modalidad;
import com.empresa.service.ModalidadService;


@RestController
@RequestMapping("/url/modalidad")
public class ModalidadController {
	@Autowired
	private ModalidadService service;
	
	@GetMapping
	public List<Modalidad> listarModalidad() {
		return service.listarModalidad();
	}
	
	@PostMapping
	public ResponseEntity<?> insertarModalidad(@RequestBody Modalidad obj) {
		List<String> lstMensaje = new ArrayList<String>();
		obj.setEstado(1);
		obj.setFechaActualizacion(new Date());
		obj.setFechaRegistro(new Date());
		Modalidad objSalida = service.insertarModalidad(obj);
		if(objSalida == null) {
			lstMensaje.add("Error en el registro");
		}else {
			lstMensaje.add("Se registro Modalidad con id " + " " + objSalida.getIdModalidad());
		}
		return ResponseEntity.ok(lstMensaje);
	}
}
