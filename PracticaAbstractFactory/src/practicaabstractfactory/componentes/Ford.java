/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.componentes;

/**
 *
 * @author Antonio
 */
public abstract class Ford {
    protected String modelo, tipo;
    protected int cv, consumo, autonomiaElectrica, recarga, plazas;
    protected float precio, cc;

    public Ford() {
    }
    //Gasolina-Diesel
    public Ford(String modelo, String tipo, int cv, int consumo, int plazas, float precio, float cc) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cv = cv;
        this.consumo = consumo;
        this.plazas = plazas;
        this.precio = precio;
        this.cc = cc;
    }

    public Ford(String modelo, String tipo, int cv, int autonomiaElectrica, int recarga, int plazas, float precio) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cv = cv;
        this.autonomiaElectrica = autonomiaElectrica;
        this.recarga = recarga;
        this.plazas = plazas;
        this.precio = precio;
    }

    public Ford(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int plazas, float precio, float cc) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cv = cv;
        this.consumo = consumo;
        this.autonomiaElectrica = autonomiaElectrica;
        this.plazas = plazas;
        this.precio = precio;
        this.cc = cc;
    }
    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getAutonomiaElectrica() {
        return autonomiaElectrica;
    }

    public void setAutonomiaElectrica(int autonomiaElectrica) {
        this.autonomiaElectrica = autonomiaElectrica;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }
    
    public abstract void mostrarCaracteristicas();
}
