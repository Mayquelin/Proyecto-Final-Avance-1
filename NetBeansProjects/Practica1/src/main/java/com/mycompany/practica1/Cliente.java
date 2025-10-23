package com.mycompany.practica1;

/**
 *
 * @author mayqu
 */
public class Cliente extends Persona {

    private double numFactura;
    private double montoFacturado;

    public Cliente(String nombre, int años, int cedula, double numFactura, double montoFactura) {
        super();
        this.numFactura = numFactura;
        this.montoFacturado = numFactura;
    }

    
}
