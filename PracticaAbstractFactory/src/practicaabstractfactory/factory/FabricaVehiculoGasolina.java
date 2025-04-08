/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.componentes.Ford;
import practicaabstractfactory.componentes.Seat;
import practicaabstractfactory.componentes.Toyota;
import practicaabstractfactory.marcas.ford.FordGasolina;
import practicaabstractfactory.marcas.seat.SeatGasolina;
import practicaabstractfactory.marcas.toyota.ToyotaGasolina;

/**
 *
 * @author Antonio
 */
public class FabricaVehiculoGasolina implements Fabrica {

    @Override
    public Ford creaFord(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new FordGasolina(modelo, tipo, cv, consumo, plazas, precio, cc);
    }

    @Override
    public Seat creaSeat(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new SeatGasolina(modelo, tipo, cv, consumo, plazas, precio, cc);
    }

    @Override
    public Toyota creaToyota(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc) {
        return new ToyotaGasolina(modelo, tipo, cv, consumo, plazas, precio, cc);
    }
    
}
