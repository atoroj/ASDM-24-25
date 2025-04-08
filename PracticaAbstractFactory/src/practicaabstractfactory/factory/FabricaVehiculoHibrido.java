/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.componentes.Ford;
import practicaabstractfactory.componentes.Seat;
import practicaabstractfactory.componentes.Toyota;
import practicaabstractfactory.marcas.ford.FordHibrido;
import practicaabstractfactory.marcas.seat.SeatHibrido;
import practicaabstractfactory.marcas.toyota.ToyotaHibrido;

/**
 *
 * @author Antonio
 */
public class FabricaVehiculoHibrido implements Fabrica {

    @Override
    public Ford creaFord(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new FordHibrido(modelo, tipo, cv, consumo, autonomiaElectrica, plazas, precio, cc);
    }

    @Override
    public Seat creaSeat(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new SeatHibrido(modelo, tipo, cv, consumo, autonomiaElectrica, plazas, precio, cc);
    }

    @Override
    public Toyota creaToyota(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new ToyotaHibrido(modelo, tipo, cv, consumo, autonomiaElectrica, plazas, precio, cc);
    }
    
}
