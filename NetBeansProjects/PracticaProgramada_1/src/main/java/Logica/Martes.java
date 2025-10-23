
package Logica;

public class Martes extends Planetas{
    private double duracionYearMarciano = 687.0;
    
    public Martes(String nombre) {
        super(nombre);
    }
   
    public void calcularYear() {
        System.out.println("El año en " + getNombre() + " dura " + duracionYearMarciano + " días terrestres.");
    }
    
}
