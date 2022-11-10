package com.example.domains.entities.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.domains.entities.Actor;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ActorDTO {
	@JsonProperty("id")
	private int actorId;
	@JsonProperty("nombre")
	private String firstName;
	@NotBlank
	@Size(max=45, min=2)
	@Pattern(regexp = "^[A-Z]+$", message = "Tiene que estar en mayusculas")
	@JsonProperty("apellidos")
	private String lastName;

	public static ActorDTO from(Actor target) {
		return new ActorDTO(
				target.getActorId(),
				target.getFirstName(),
				target.getLastName()
				);
	}
	public static Actor from(ActorDTO target) {
		return new Actor(
				target.getActorId(),
				target.getFirstName(),
				target.getLastName()
				);
	}
}
