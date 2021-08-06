package com.system.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "Docente")
public class Docente extends Persona {
	private static final long serialVersionUID = 1L;

}
