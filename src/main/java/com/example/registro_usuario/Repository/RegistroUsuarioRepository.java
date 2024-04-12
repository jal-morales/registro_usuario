package com.example.registro_usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registro_usuario.Model.RegistroUsuario;

public interface RegistroUsuarioRepository extends JpaRepository<RegistroUsuario, Integer>{
    
    
}
