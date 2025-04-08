/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.seat;

import practicaabstractfactory.componentes.Seat;

/**
 *
 * @author Antonio
 */
public class SeatElectrico extends Seat {

    public SeatElectrico(String modelo, String tipo, int cv, int autonomiaElectrica, int recarga, int plazas, float precio) {
        super(modelo, tipo, cv, autonomiaElectrica, recarga, plazas, precio);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
