/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.toyota;

import practicaabstractfactory.componentes.Gasolina;

/**
 *
 * @author Antonio
 */
public class ToyotaGasolina extends Gasolina {

    public ToyotaGasolina(String marca, String modelo, int cv, int consumo, int plazas, float precio) {
        super(marca, modelo, cv, consumo, plazas, precio);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
