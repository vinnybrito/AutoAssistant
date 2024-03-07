package br.com.fiap.challenge.model.dto;

public record Token(
    String token,
    String type,
    String prefix
) {} 
