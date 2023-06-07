package com.example.cadastrousuario.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;
}

