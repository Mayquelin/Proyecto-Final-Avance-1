
package Logica;


public class Jupiter extends Planetas{
    
    private double duracionYearJupiter =4333.0;

    public Jupiter(String nombre) {
        super(nombre);
    }
    public void calcularYear(){
    System.out.println("El año en " + getNombre() + " dura " + duracionYearJupiter + " días terrestres.");
    
    }
}
