package com.example.domains.entities.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface ActorShort {
	@Value("#{target.actorId}")
	int getId();
	@Value("#{target.firstName + ' ' + target.lastName}")
	String getNombre();
}
