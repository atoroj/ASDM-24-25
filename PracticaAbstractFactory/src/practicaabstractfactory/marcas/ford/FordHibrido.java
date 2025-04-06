/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.ford;

import practicaabstractfactory.componentes.Hibrido;

/**
 *
 * @author Antonio
 */
public class FordHibrido extends Hibrido {

    public FordHibrido(String marca, String modelo, int cv, int consumo, int autonomiaElectrica, int plazas, float precio) {
        super(marca, modelo, cv, consumo, autonomiaElectrica, plazas, precio);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
