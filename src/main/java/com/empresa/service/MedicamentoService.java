package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	public abstract List<Medicamento> listarMedicamentos();
	public abstract List<Medicamento> listarPorId(int idMedicamento);
	public abstract List<Medicamento> listarPorLaboratorio(String laboratorio);
	public abstract List<Medicamento> listarPorNombreMedicamento(String nombre);
}
