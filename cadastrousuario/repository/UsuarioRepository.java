package com.example.cadastrousuario.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.cadastrousuario.entity.Usuario;

@Repository
public class UsuarioRepository {
    List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> buscarUsuarios() {
        return usuarios;
    }

    public Usuario adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario buscarUsuarioPorId(Long id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    public Usuario deletarUuario( Usuario usuario){
        usuarios.remove(usuario);
        return usuario;
    }
}

