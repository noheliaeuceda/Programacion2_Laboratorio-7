/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7nohelia;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author euced
 */
public class AdminMensajes extends Thread {

    private boolean avanzar;
    private boolean vive;
    private JTable tabla;
    private boolean longi;
    private Pc pc1;
    private Pc pc2;
    private Mensaje m;

    public AdminMensajes(JTable tabla, boolean longi, Pc pc1, Pc pc2, Mensaje m) {
        this.tabla = tabla;
        this.vive = true;
        this.avanzar = true;
        this.longi = longi;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.m = m;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (vive) {
            if (avanzar) {
                if (longi) {// cuando estan dentro de la misma lan
                    
                    try {
                        Thread.sleep( pc1.getS().getVelocidadRecepcion());
                    } catch (Exception e) {
                    }
                    Object row[] = {m.getTitulo(), pc1.getS().getNombre(), pc1.getS().getVelocidadRecepcion(), "Entregado"};
                    modelo.addRow(row);
                    try {
                        Thread.sleep( pc1.getS().getVelocidadTransmision());
                    } catch (Exception e) {
                    }
                    Object row2[] = {m.getTitulo(), "PC con IP: "+ pc1.getIp(), pc1.getS().getVelocidadTransmision(), "Entregado"};
                    modelo.addRow(row2);
                    vive =false;
                } else {
                    //compu al switch
                    try {
                        Thread.sleep( pc1.getS().getVelocidadRecepcion());
                    } catch (Exception e) {
                    }
                    Object row[] = {m.getTitulo(), pc1.getS().getNombre(), pc1.getS().getVelocidadRecepcion(), "Entregado"};
                    modelo.addRow(row);
                    try {
                        Thread.sleep(pc1.getS().getRouter().getVr());
                    } catch (Exception e) {
                    }
                    //switch al router 1
                    if (pc1.getS().getRouter().getVr()>pc1.getS().getVelocidadTransmision()) {
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getIp() ,pc1.getS().getRouter().getVr(), "Entregado"};
                        modelo.addRow(row2);
                    }else{
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getIp() , pc1.getS().getVelocidadTransmision(), "Error"};
                        modelo.addRow(row2);
                    }
                    //router1 a router2
                    
                    try {
                        Thread.sleep(pc1.getS().getRouter().getWan().get(0).getVr());
                    } catch (Exception e) {
                    }
                    if (pc1.getS().getRouter().getWan().get(0).getVr()>pc1.getS().getRouter().getVr()) {
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getIp() ,pc1.getS().getRouter().getWan().get(0).getVr(), "Entregado"};
                        modelo.addRow(row2);
                    }else{
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getIp(), pc1.getS().getRouter().getWan().get(0).getVr(), "Error"};
                        modelo.addRow(row2);
                    }
                    //router2 a switch
                   try {
                        Thread.sleep(pc1.getS().getRouter().getWan().get(0).getVr());
                    } catch (Exception e) {
                    }
                    if (pc1.getS().getRouter().getWan().get(0).getSw().getVelocidadRecepcion()>pc1.getS().getRouter().getWan().get(0).getVt()) {
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getWan().get(0).getSw().getNombre() ,pc1.getS().getRouter().getWan().get(0).getSw().getVelocidadTransmision(), "Entregado"};
                        modelo.addRow(row2);
                    }else{
                        Object row2[] = {m.getTitulo(),pc1.getS().getRouter().getWan().get(0).getSw().getNombre() ,pc1.getS().getRouter().getWan().get(0).getSw().getVelocidadTransmision(), "Error"};
                        modelo.addRow(row2);
                    }
                    //switch a compu
                    try {
                        Thread.sleep(pc1.getS().getRouter().getWan().get(0).getVr());
                    } catch (Exception e) {
                    }
                   
                        Object row2[] = {m.getTitulo(),pc2.getIp() ,pc2.getS().getVelocidadTransmision(), "Entregado"};
                        modelo.addRow(row2);
                    
                    
                    vive =false;
                }
            }

        }
    }

}
