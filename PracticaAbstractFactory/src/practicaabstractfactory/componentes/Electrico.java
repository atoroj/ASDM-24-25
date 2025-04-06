/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.componentes;

/**
 *
 * @author Antonio
 */
public abstract class Electrico {
    protected String modelo, marca;
    protected int cv, autonomia, tiempoRecarga, plazas;
    protected float precio;

    public Electrico() {
    }

    public Electrico(String marca, String modelo, int cv, int autonomia, int tiempoRecarga, int plazas, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.autonomia = autonomia;
        this.tiempoRecarga = tiempoRecarga;
        this.plazas = plazas;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(int tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public abstract void mostrarCaracteristicas();
}
