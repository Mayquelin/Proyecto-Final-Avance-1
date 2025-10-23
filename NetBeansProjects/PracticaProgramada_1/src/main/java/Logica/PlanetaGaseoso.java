
package Logica;


public class PlanetaGaseoso extends cuerpoCeleste implements Planeta{
     private int numeroLunas;

    public PlanetaGaseoso(String nombre, double tamano, double distanciaAlSol, int numeroDeLunas) {
        super(nombre, tamano, distanciaAlSol);
        this.numeroLunas = numeroLunas;
    }
    

    @Override
    public double calcularyear() {
        return Math.pow(distanciaAlSol, 1.5) * 15;
    }

    @Override
    public String toString() {
        return "Planeta Gaseoso: " + nombre + ", Tamaño: " + tamano + ", Distancia al Sol: " + distanciaAlSol + ", Lunas: " + numeroLunas;
    }

    @Override
    public int getNumeroDeLunas() {
        return numeroLunas;
    }
    
    }

