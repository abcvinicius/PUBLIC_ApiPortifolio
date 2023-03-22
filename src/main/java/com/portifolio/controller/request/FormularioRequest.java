package com.portifolio.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormularioRequest {

	private String nome;

	private String email;

	private String telefone;

	private String descricao;
}
