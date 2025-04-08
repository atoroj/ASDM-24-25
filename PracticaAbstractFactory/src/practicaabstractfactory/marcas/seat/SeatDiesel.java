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
public class SeatDiesel extends Seat {

    public SeatDiesel(String modelo, String tipo, int cv, int consumo, int plazas, float precio, float cc) {
        super(modelo, tipo, cv, consumo, plazas, precio, cc);
    }

    @Override
    public void mostrarCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
