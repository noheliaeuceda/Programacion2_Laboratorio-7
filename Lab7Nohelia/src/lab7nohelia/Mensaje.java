/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7nohelia;

/**
 *
 * @author euced
 */
public class Mensaje {
    private String ipOrigen;
    private String ipDestino;
    private String titulo;
    private String contenido;

    public Mensaje(String ipOrigen, String ipDestino, String titulo, String contenido) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "ipOrigen=" + ipOrigen + ", ipDestino=" + ipDestino + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }
    
    
}
