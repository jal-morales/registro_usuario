package com.example.registro_usuario.Services;

import java.util.List;
import java.util.Optional;

import com.example.registro_usuario.Model.RegistroUsuario;

public interface RegistroUsuarioServices {
    List<RegistroUsuario> getAllRegistroUsuarios();
    Optional <RegistroUsuario> getRegistroUsuarioById(Integer id_ru);

/*CREAR METODOS*/

    RegistroUsuario createUsuario(RegistroUsuario registro_usuario);
    RegistroUsuario  updateUsuario(Integer id_ru, RegistroUsuario registro_usuario);
    void deleteUsuarios(Integer id_ru);
 
}
