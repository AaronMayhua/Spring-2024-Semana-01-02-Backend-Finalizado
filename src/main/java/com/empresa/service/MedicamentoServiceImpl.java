package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	/*Inyector de Dependencyas*/
	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listarMedicamentos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Medicamento> listarPorId(int idMedicamento) {
		// TODO Auto-generated method stub
		return repository.findByIdMedicamento(idMedicamento);
	}

	@Override
	public List<Medicamento> listarPorLaboratorio(String laboratorio) {
		// TODO Auto-generated method stub
		return repository.findByLaboratorio(laboratorio);
	}

	@Override
	public List<Medicamento> listarPorNombreMedicamento(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombre(nombre);
	}

}
