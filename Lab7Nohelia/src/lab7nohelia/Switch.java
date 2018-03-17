/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7nohelia;

import java.util.ArrayList;

/**
 *
 * @author euced
 */
public class Switch {
    private String nombre;
    private int velocidadTransmision;
    private int velocidadRecepcion;
    private Router router;
    ArrayList<Pc> listaPC = new ArrayList();

    public Switch() {
    }

    public Switch(String nombre, int velocidadTransmision, int velocidadRecepcion) {
        this.nombre = nombre;
        this.velocidadTransmision = velocidadTransmision;
        this.velocidadRecepcion = velocidadRecepcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadTransmision() {
        return velocidadTransmision;
    }

    public void setVelocidadTransmision(int velocidadTransmision) {
        this.velocidadTransmision = velocidadTransmision;
    }

    public int getVelocidadRecepcion() {
        return velocidadRecepcion;
    }

    public void setVelocidadRecepcion(int velocidadRecepcion) {
        this.velocidadRecepcion = velocidadRecepcion;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public ArrayList<Pc> getListaPC() {
        return listaPC;
    }

    public void setListaPC(ArrayList<Pc> listaPC) {
        this.listaPC = listaPC;
    }

    @Override
    public String toString() {
        return "Switch{" + "nombre=" + nombre + ", velocidadTransmision=" + velocidadTransmision + ", velocidadRecepcion=" + velocidadRecepcion + ", router=" + router + ", listaPC=" + listaPC + '}';
    }
    
    
    
    
}
