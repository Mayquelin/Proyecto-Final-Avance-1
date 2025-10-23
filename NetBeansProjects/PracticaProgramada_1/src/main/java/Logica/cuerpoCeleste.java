
package Logica;


public abstract class  cuerpoCeleste {
     protected String nombre;
        protected double tamano; 
        protected double distanciaAlSol; 
        protected int numeroDeLunas;

        public cuerpoCeleste(String nombre, double tamano, double distanciaAlSol) {
            this.nombre = nombre;
            this.tamano = tamano;
            this.distanciaAlSol = distanciaAlSol;
        }
        
         public String getNombre() { 
             return nombre; }
         
        public double getTamano() { 
            return tamano; }
        
        public double getDistanciaAlSol() {
            return distanciaAlSol; }
        
       
        
        public abstract double calcularyear();

        
        }
        

        
        
       
