package com.example.registro_usuario;

import java.util.List;

public class RegistroUsario {
    private int idRegistroUsario;
    private String nombres;
    private String apellidos;
    private String rut;
    private String tel;
    private String rol;
    private String direccionDespacho;
    private List<OtrasDirecciones> otrasDirecciones;

    

    


    public RegistroUsario(int idRegistroUsario,String nombres, String apellidos,String rut,String tel, String rol, String direccionDespacho, List<OtrasDirecciones> otrasDirecciones)
    {
        this.idRegistroUsario=idRegistroUsario;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.rut=rut;
        this.tel=tel;
        this.rol=rol;
        this.direccionDespacho=direccionDespacho;
        this.otrasDirecciones=otrasDirecciones;
    }

    public int getIdRegistroUsario() {
        
            return this.idRegistroUsario;

	}

	public String getNombres() {
        if (this.nombres=="" || this.nombres==null) {
            return "Los nombres no se ha ingresado";
        }
        else{
            return this.nombres;
        }
		
	}

	

	public String getApellidos() {

        if(this.apellidos=="" || this.apellidos==null)
        {
            return "Los apellidos no han sido ingresados";
        }
        else{
            return this.apellidos;
        }
		
	}

	

	public String getRut() {
        if(this.rut=="" || this.rut==null)
        {
            return "El rut no han sido ingresados";
        }
        else{
            return this.rut;
        }

		
	}

	

	public String getTel() {
        if(this.tel=="" || this.tel==null)
        {
            return "El telefono no han sido ingresado";
        }
        else{
            return this.tel;
        }
		
	}

	

	public String getRol() {
        if(this.rol=="" || this.rol==null)
        {
            return "El rol no han sido ingresado";
        }
        else{
            return this.rol;
        }
		
		
	}

	

	public String getDireccionDespacho() {
        if(this.direccionDespacho=="" || this.direccionDespacho==null)
        {
            return "La direccion despacho no han sido ingresado";
        }
        else{
            return this.direccionDespacho;
        }
		
	}

	
    public List<OtrasDirecciones> getOtrasDirecciones() {
        return this.otrasDirecciones;
    }


    
}
