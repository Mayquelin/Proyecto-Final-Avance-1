/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author mayqu
 */
public class Persona {

     String nombre;
     int años;
     int cedula;

    public class persona {

        String nombre;
        int años;
        int cedula;

        public persona(String nombre, int años, int cedula) {

            this.nombre = nombre;
            this.años = años;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getAños() {
            return años;
        }

        public void setAños(int años) {
            this.años = años;
        }

        public int getCedula() {
            return cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

       

    }
}
