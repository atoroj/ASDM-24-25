/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.componentes;

/**
 *
 * @author Antonio
 */
public abstract class Diesel {
    protected String modelo, marca;
    protected int cv, consumo, plazas;
    protected float precio;
    
    public Diesel() {
    }

    public Diesel(String marca, String modelo, int cv, int consumo, int plazas, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.consumo = consumo;
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

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
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
