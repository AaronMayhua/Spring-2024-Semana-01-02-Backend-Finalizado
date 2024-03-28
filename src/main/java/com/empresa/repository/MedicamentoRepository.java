package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.entity.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	public List<Medicamento> findByIdMedicamento(int idMedicamento);
	public List<Medicamento> findByNombre(String nombre);
	public List<Medicamento> findByLaboratorio (String laboratorio);
	
}
