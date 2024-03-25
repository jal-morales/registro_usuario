package com.example.registro_usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;




@RestController
public class RegistroJavaController {
    
    //declararemos una Lista tipo privada de la clase Registro Usuarios

    private  List<RegistroUsario> usuarios= new ArrayList<>();

    //ahora instanciamos el contructor donde almacenaremos los usuarios

    public RegistroJavaController()
    {
       // Agregar usuarios
       
        
        usuarios.add(new RegistroUsario(1, "Javier Antonio", "Lopez Morales", "17.366.925-k", "89255472", 
        "Operador", "los Papitas 1045, Maipu", Arrays.asList(new OtrasDirecciones(1, "Los zarzales 1825", "Maipu", "Santiago"))));

        usuarios.add(new RegistroUsario(2, "jaime juan", "Sanchez ramire", "18.366.925-k", "99255472", 
        "Visualizador", "los Gorriones 1145, Quilicura", Arrays.asList(
        new OtrasDirecciones(2, "Los Diamantes 1023", "Quilicura", "Santiago"),
        new OtrasDirecciones(3, "Los canarios 8526", "Quilicura", "Santiago"))));

        usuarios.add(new RegistroUsario(3, "daniel Francisco", "gutierrez soto", "19.366.925-k", "97255472", 
        "Operador", "los santas 1025, San Bernardo", Arrays.asList(new OtrasDirecciones(1, "los riquelme 1025", "San Bernardo", "Santiago"), new OtrasDirecciones(4, "Santa margarita 5028", "San Bernardo", "Santiago")
        , new OtrasDirecciones(5, "Santa Luisa 8598", "San Bernardo", ""))));
   

         
 
    }


   
   @GetMapping("/usuarios")
   public List<RegistroUsario> registroUsarios(){
    return usuarios;
   }

@GetMapping("/usuarios/{idRegistroUsariod}")
public RegistroUsario getListadoPeliculastById(@PathVariable int idRegistroUsariod) {
            
    for(RegistroUsario usuario: usuarios)
    {
        if (usuario.getIdRegistroUsario()==idRegistroUsariod) {
            return usuario;
        }

    }
    return null;
}

@GetMapping("/usuarios/rol/{rol}")
public List<RegistroUsario> getListadoUsuariosPorRol(@PathVariable String rol) {
       List<RegistroUsario> uConRol=new ArrayList<>();


     for(RegistroUsario usuario: usuarios)
     {
        if (usuario.getRol().equals(rol)) {
            uConRol.add(usuario);
            //aca tenia un return y cortaba el ciclo por eso en el video me sale un registro solamente.
           
        }
        else{
            Logger logger = LoggerFactory.getLogger(getClass());
         logger.info("No se encontraron usuarios con el rol especificado: {}", rol);
        }
 
     }
     return uConRol;
    
}


   
}
