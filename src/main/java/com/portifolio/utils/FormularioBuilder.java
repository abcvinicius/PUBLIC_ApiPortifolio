package com.portifolio.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.portifolio.controller.request.FormularioRequest;
import com.portifolio.controller.response.FormularioResponse;
import com.portifolio.model.Formulario;

@Component
public class FormularioBuilder {

	// List
	public List<FormularioResponse> buildFormularioResponse(List<Formulario> formulario) {
		return formulario.stream().map(formularios -> buildFormularioResponse(formularios)).toList();
	}

	// Response
	public FormularioResponse buildFormularioResponse(Formulario formulario) {
		return FormularioResponse.builder().id(formulario.getId()).nome(formulario.getNome())
				.email(formulario.getEmail()).telefone(formulario.getTelefone()).descricao(formulario.getDescricao())
				.build();
	}

	// Request
	public Formulario buildFormulario(FormularioRequest formularioRequest) {
		return Formulario.builder().nome(formularioRequest.getNome()).email(formularioRequest.getEmail())
				.telefone(formularioRequest.getTelefone()).descricao(formularioRequest.getDescricao()).build();
	}

}
