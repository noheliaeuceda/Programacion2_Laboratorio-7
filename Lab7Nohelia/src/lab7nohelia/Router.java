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
public class Router {
    private String ip;
    private Switch sw;
    private String mascara;
    private int vt;
    private int vr;
    private String protocolo;
    private ArrayList<Router> wan = new ArrayList();

    public Router() {
    }

    public Router( String ip, String mascara, int vt, int vr, String protocolo, Switch s) {
        
        this.ip = ip;
        this.mascara = mascara;
        this.vt = vt;
        this.vr = vr;
        this.protocolo = protocolo;
        this.sw = s;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    
    
    

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Switch getSw() {
        return sw;
    }

    public void setSw(Switch sw) {
        this.sw = sw;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public int getVt() {
        return vt;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }

    public int getVr() {
        return vr;
    }

    public void setVr(int vr) {
        this.vr = vr;
    }

    public ArrayList<Router> getWan() {
        return wan;
    }

    public void setWan(ArrayList<Router> wan) {
        this.wan = wan;
    }

    @Override
    public String toString() {
        return "R0    ip: " + ip + "    mascara:   " + mascara;
    }

    
    
    
}
