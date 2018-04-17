package modelo;
// Generated mar 20, 2018 3:48:40 p.m. by Hibernate Tools 4.3.1


import java.util.Date;
import lombok.*;

/**
 * Usuario generated by hbm2java
 */

public class Usuario  implements java.io.Serializable {


     private String correo;
     private String nombreUsuario;
     private Date fechaNacimiento;
     private boolean esAdmin;
     private String contrasena;
     @Getter @Setter private boolean activado;
     @Getter @Setter private int hash;
     
    public Usuario() {
    }

	
    public Usuario(String correo, String nombreUsuario, boolean esAdmin, String contrasena) {
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.esAdmin = esAdmin;
        this.contrasena = contrasena;
    }
    @Builder
    public Usuario(String correo, String nombreUsuario, Date fechaNacimiento, boolean esAdmin, String contrasena, boolean activado, int hash) {
       this.correo = correo;
       this.nombreUsuario = nombreUsuario;
       this.fechaNacimiento = fechaNacimiento;
       this.esAdmin = esAdmin;
       this.contrasena = contrasena;
       this.activado = activado;
       this.hash = hash;
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public boolean isEsAdmin() {
        return this.esAdmin;
    }
    
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }




}


