/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionasistencia_t2;

import entidades.Clase;
import entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameGestorClases;

/**
 *
 * @author Fabricio
 */
public class GestionAsistencia_T2 {

    /**
     * @param args the command line arguments
     */
    public static List<Clase> clasesEnElSistema;
    public static List<Estudiante> listaDeEstudiantes;
    
    
    public static List<String> fechasDisponibles=new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
         clasesEnElSistema=new ArrayList<>();
        listaDeEstudiantes=new ArrayList<>();
        
        
        
        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        //Inicio la ventana principal de gestor de citas.
        
        JFrameGestorClases framePrincipal= new JFrameGestorClases();
        framePrincipal.setLocationRelativeTo(null); //Centra el Formulario
        framePrincipal.setVisible(true);//Propiedad que me permite mostrar la pantalla
    }
    
}
