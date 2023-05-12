/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fabricio
 */
public class Estudiante {
    
    private String dni;
    private String telefono;
    private String nombreCompleto;
    private int sexoBiologico;
    private int estadoAsistencia;
    
    public final static int MASCULINO=0;
    public final static int FEMENINO=1;
    
    public final static int ASISTIO=2;
    public final static int TARDANZA=3;
    public final static int FALTO=4;
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
   

    public int getEstadoAsistencia() {
        return estadoAsistencia;
    }

    public void setEstadoAsistencia(int estadoAsistencia) {
        this.estadoAsistencia = estadoAsistencia;
    }
    
     public String getDatosMostrar(){
        
        return this.nombreCompleto+" || DNI: "+this.dni;
        
    }
    
}
