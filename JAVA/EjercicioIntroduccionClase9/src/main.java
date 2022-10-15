/*
 Crea una clase Persona con las siguientes variables:

La edad,El nombre,El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad
, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una 
variable salario que solo tenga la clase Trabajador.
 */

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {
       Cliente c = new Cliente();
        System.out.println("CLIENTE");
       c.setCredito(10000);
       c.setEdad(19);
       c.setNombre("Joaquin");
       c.setTelefono(1138428284);
       
        System.out.println("El nombre es "+c.getNombre()+ " tiene " + c.getEdad() + " su telefono es " +c.getTelefono()+ " y posee un credito de " + c.getCredito());
        System.out.println("TRABAJADOR");
        Trabajador t = new Trabajador();
        t.setEdad(51);
        t.setNombre("Alcides");
        t.setSalario(50000);
        t.setTelefono(1169480298);
        System.out.println("El nombre es "+t.getNombre()+ " tiene " + t.getEdad() + " su telefono es " +t.getTelefono() +" y posee un sueldo de " + t.getSalario());
    }
}
