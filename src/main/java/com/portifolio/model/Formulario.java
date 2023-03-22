package com.portifolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Formulario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formulario_id")
	@SequenceGenerator(name = "formulario_id", sequenceName = "formulario_id", allocationSize = 1)
	private Long id;

	private String nome;

	private String email;

	private String telefone;

	private String descricao;

}
