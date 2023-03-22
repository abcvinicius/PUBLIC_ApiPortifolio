package com.portifolio.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FormularioResponse {

	private Long id;

	private String nome;

	private String email;

	private String telefone;

	private String descricao;
}
