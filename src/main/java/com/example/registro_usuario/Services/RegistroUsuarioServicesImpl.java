package com.example.registro_usuario.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registro_usuario.Model.RegistroUsuario;
import com.example.registro_usuario.Repository.RegistroUsuarioRepository;

@Service
public class RegistroUsuarioServicesImpl  implements  RegistroUsuarioServices{
@Autowired
private  RegistroUsuarioRepository registroUsuarioRepository;
@Override
    public List<RegistroUsuario> getAllRegistroUsuarios(){
        return registroUsuarioRepository.findAll();
    }

@Override
    public Optional<RegistroUsuario> getRegistroUsuarioById(Integer id_ru){
 
     return registroUsuarioRepository.findById(id_ru);
    }
@Override
    public RegistroUsuario createUsuario(RegistroUsuario registroUsuario)
    {

        return registroUsuarioRepository.save(registroUsuario);
    }
@Override
    public RegistroUsuario updateUsuario(Integer id_ru, RegistroUsuario registro_usuario){
        registro_usuario.setId_ru(id_ru);
        return registroUsuarioRepository.save(registro_usuario);  
    } 
@Override
    public void deleteUsuarios(Integer id_ru){
        registroUsuarioRepository.deleteById(id_ru);
    }
}
