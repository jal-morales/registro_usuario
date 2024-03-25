package com.example.registro_usuario;

public class OtrasDirecciones {
    
    private int idOd;
    private String direccion;
    private String comuna;
    private String ciudad;

    public OtrasDirecciones(int idOd, String direccion, String comuna,String ciudad)
    {
        this.direccion=direccion;
        this.comuna=comuna;
        this.ciudad=ciudad;
        this.idOd=idOd;
    }
    public String getDireccion() {
        if (this.direccion=="" || this.direccion==null) {
            return "La direccion no se ha ingresado";
        }
        else{
            return this.direccion;
        }
    }

    public String getComuna() {
        if (this.comuna=="" || this.comuna==null) {
            return "La Comuna no se ha ingresado";
        }
        else{
            return this.comuna;
        }
        
    } 

    public String getCiudad() {
        if (this.ciudad=="" || this.ciudad==null) {
            return "La Ciudad no se ha ingresado";
        }
        else{
            return this.ciudad;
        }
       
    }

    public int getIdOd() {
        
            return this.idOd;
       
    }


}
