/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.toyota;

import practicaabstractfactory.componentes.Toyota;

/**
 *
 * @author Antonio
 */
public class ToyotaHibrido extends Toyota {

    public ToyotaHibrido(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int plazas, float precio, float cc) {
        super(modelo, tipo, cv, consumo, autonomiaElectrica, plazas, precio, cc);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
