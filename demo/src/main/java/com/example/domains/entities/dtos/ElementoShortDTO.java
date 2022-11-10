package com.example.domains.entities.dtos;

import lombok.Value;

@Value
public class ElementoShortDTO<K, V> {
	K key;
	V value;
}
