package com.portifolio.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.portifolio.Service.FormularioService;
import com.portifolio.controller.request.FormularioRequest;
import com.portifolio.controller.response.FormularioResponse;

@RequestMapping("/portifolio")
@RestController
@CrossOrigin("*")
public class FormularioController {
	
	@Autowired
	FormularioService formularioService;
	
	@PostMapping("/formulario")
	public ResponseEntity<FormularioResponse> cadastroFormulario(@RequestBody @Validated FormularioRequest formularioRequest,
			UriComponentsBuilder UriBuilder) throws Exception {
		
		FormularioResponse formulario = formularioService.save(formularioRequest);
		
		URI uri = UriBuilder.path("/formulario/{id}").buildAndExpand(formulario.getId()).toUri();
		
		return ResponseEntity.created(uri).body(formulario);
		
	}

}
