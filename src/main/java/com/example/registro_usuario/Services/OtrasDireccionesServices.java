package com.example.registro_usuario.Services;

import java.util.List;
import java.util.Optional;

import com.example.registro_usuario.OtrasDirecciones;

public interface OtrasDireccionesServices {

    List<OtrasDirecciones> getAllOtrasDirecciones();
    Optional <OtrasDirecciones> getOtrasDireccionById(Integer id_od);

/*CREAR METODOS*/

    OtrasDirecciones createOtraDireccion(OtrasDirecciones OtrasDirecciones);
    OtrasDirecciones  updateOtrasDireccion(Integer id_od, OtrasDirecciones OtrasDirecciones);
    void deleteOtrasDireccion(Integer id_od);
}
