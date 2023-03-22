package com.portifolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.controller.request.FormularioRequest;
import com.portifolio.controller.response.FormularioResponse;
import com.portifolio.repository.FormularioRepository;
import com.portifolio.utils.FormularioBuilder;

@Service
public class FormularioService {

	@Autowired
	FormularioRepository formularioRepository;

	@Autowired
	FormularioBuilder formularioBuilder;

	// Save
	public FormularioResponse save(FormularioRequest formularioRequest) {
		return formularioBuilder.buildFormularioResponse(
				formularioRepository.save(formularioBuilder.buildFormulario(formularioRequest)));
	}

	// Search
	public List<FormularioResponse> buscar() {
		return formularioBuilder.buildFormularioResponse(formularioRepository.findAll());
	}
}
