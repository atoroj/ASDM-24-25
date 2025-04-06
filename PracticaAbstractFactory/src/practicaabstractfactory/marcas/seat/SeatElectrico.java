/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.seat;

import practicaabstractfactory.componentes.Electrico;

/**
 *
 * @author Antonio
 */
public class SeatElectrico extends Electrico {

    public SeatElectrico(String marca, String modelo, int cv, int autonomia, int tiempoRecarga, int plazas, float precio) {
        super(marca, modelo, cv, autonomia, tiempoRecarga, plazas, precio);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
