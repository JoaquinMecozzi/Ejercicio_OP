/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setNombre("Joaquin");
        p.setEdad(19);
        p.setTelefono(1138428284);
        
        System.out.println("Esto lo programo "+p.getNombre());
        System.out.println("Tiene " + p.getEdad()+" de edad");
        System.out.println("El telefono es "+ p.getTelefono());
        
        
    }
    
}
