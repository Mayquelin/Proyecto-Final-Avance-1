
package Logica;

/**
 *
 * @author mayqu
 */
public abstract class  PlanetaRocoso extends cuerpoCeleste implements Planeta  {
    private int numeroLunas;

    public PlanetaRocoso(String nombre, double tamano, double distanciaAlSol) {
        super(nombre, tamano, distanciaAlSol );
         this.numeroLunas = numeroLunas;
         
         
    }

    
     
  
    
   // public abstract classs PlanetaRocoso(String mercurio, double d, double d0, int i);  
        
   

     
    

    @Override
    public double calcularyear() {
         return Math.pow(distanciaAlSol, 1.5) * 10;
    }


    @Override
    public int getNumeroDeLunas() {
        return numeroLunas;
    }

    @Override
    public String toString() {
        return "Planeta Rocoso: " + nombre + ", Tamaño: " + tamano + ", Distancia al Sol: " + distanciaAlSol + ", Lunas: " + numeroLunas;
    }

}
