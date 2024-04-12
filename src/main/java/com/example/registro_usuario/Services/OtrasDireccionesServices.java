package com.example.registro_usuario.Services;

import java.util.List;
import java.util.Optional;

import com.example.registro_usuario.Model.OtrasDirecciones;



public interface OtrasDireccionesServices {

    List<OtrasDirecciones> getAllOtrasDirecciones();
    Optional <OtrasDirecciones> getOtrasDireccionById(Integer id_od);

/*CREAR METODOS*/

    OtrasDirecciones createOtraDireccion(OtrasDirecciones otrasDirecciones);
    OtrasDirecciones  updateOtrasDireccion(Integer id_od, OtrasDirecciones otrasDirecciones);
    void deleteOtrasDireccion(Integer id_od);
}
