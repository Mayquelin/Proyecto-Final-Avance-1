
package Logica;


public class Tierra extends Planetas{
    
   private double duracionYearTerrestre = 365.25;

    public Tierra(String nombre) {
        super(nombre);
    }
   
     public void calculaYear() {
        System.out.println("El año en " + getNombre() + " dura " + duracionYearTerrestre + " días.");
    }


  
    
}
