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
public class Pc {
    private String mascara;
    private String ip;
    private Switch s;
    private String gateway;
    private ArrayList<Mensaje> mensajes = new ArrayList();
    

    public Pc(String mascara, String ip, Switch s, String gateway) {
        this.mascara = mascara;
        this.ip = ip;
        this.s = s;
        this.gateway =gateway;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
    

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Switch getS() {
        return s;
    }

    public void setS(Switch s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "P      ip: " +ip + "      mascara      " + mascara ;
    }
    
    
    
}
