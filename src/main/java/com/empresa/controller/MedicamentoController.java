package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoController {
	
	/*Inyecsion de dependencyas*/
	@Autowired
	private MedicamentoService service;
	
	@GetMapping
    public List<Medicamento> listarMedicamentos() {
        List<Medicamento> listadoALL = service.listarMedicamentos();
        return listadoALL;
    }
	
	@GetMapping("/porNombreLike/{nombre}")
	public List<Medicamento> listarPorNombre (@PathVariable("nombre") String nombre) {
		List<Medicamento> listarNombre = service.listarPorNombreMedicamento(nombre + "%");
		
		return listarNombre;
	}
	
	@GetMapping("/porId/{idMedicamento}")
	public List<Medicamento> listarPorId (@PathVariable("idMedicamento") int idMedicamento) {
		List<Medicamento> listarID = service.listarPorId(idMedicamento);
		return listarID;
	}
	
	@GetMapping("/porLaboratorioLike/{laboratorio}") 
	public List<Medicamento> listaLaboratorio (@PathVariable("laboratorio") String laboratorio) {
		List<Medicamento> listarLaboratorio = service.listarPorLaboratorio(laboratorio + "%");
		return listarLaboratorio;
	}
}
