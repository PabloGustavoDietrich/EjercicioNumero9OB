
package ejercicionumero9ob;

public class EjercicioNumero9OB {

    public static void main(String[] args) {
    /*Crea una clase Persona con las siguientes variables:
     La edad
     El nombre
     El teléfono
     Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
     Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
     Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/
     
    Cliente cliente = new Cliente();
    cliente.setEdad(30);
    cliente.setNombre("Pedro");
    cliente.setTelefono(369369);
    cliente.setCredito(10000);
    System.out.println(cliente.getNombre());
    System.out.println(cliente.getCredito());
    System.out.println(cliente.getEdad());
    System.out.println(cliente.getTelefono());
    
    Trabajador trabajador = new Trabajador();
    trabajador.setEdad(35);
    trabajador.setNombre("Carlos");
    trabajador.setTelefono(257257);
    trabajador.setSalario(1500);
    System.out.println(trabajador.getNombre());
    System.out.println(trabajador.getSalario());
    System.out.println(trabajador.getEdad());
    System.out.println(trabajador.getTelefono());
    
    
    
    }
    
}
