/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.componentes.Ford;
import practicaabstractfactory.componentes.Seat;
import practicaabstractfactory.componentes.Toyota;
import practicaabstractfactory.marcas.ford.FordElectrico;
import practicaabstractfactory.marcas.seat.SeatElectrico;
import practicaabstractfactory.marcas.toyota.ToyotaElectrico;

/**
 *
 * @author Antonio
 */
public class FabricaVehiculoElectrico implements Fabrica {

    @Override
    public Ford creaFord(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new FordElectrico(modelo, tipo, cv, autonomiaElectrica, recarga, plazas, precio);
    }

    @Override
    public Seat creaSeat(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new SeatElectrico(modelo, tipo, cv, autonomiaElectrica, recarga, plazas, precio);
    }

    @Override
    public Toyota creaToyota(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new ToyotaElectrico(modelo, tipo, cv, autonomiaElectrica, recarga, plazas, precio);
    }
    
}
