/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.factory.FabricaVehiculo;
import practicaabstractfactory.componentes.Electrico;
import practicaabstractfactory.componentes.Diesel;
import practicaabstractfactory.componentes.Gasolina;
import practicaabstractfactory.componentes.Hibrido;
import practicaabstractfactory.marcas.toyota.ToyotaDiesel;
import practicaabstractfactory.marcas.toyota.ToyotaElectrico;
import practicaabstractfactory.marcas.toyota.ToyotaGasolina;
import practicaabstractfactory.marcas.toyota.ToyotaHibrido;

/**
 *
 * @author Antonio
 */
public class FabricaVehiculoToyota implements FabricaVehiculo {

    @Override
    public Diesel creaDiesel(String marca, String modelo, int cv, int consumo, int plazas, float precio) {
        return new ToyotaDiesel(marca, modelo, cv, consumo, plazas, precio);
    }

    @Override
    public Gasolina creaGasolina(String marca, String modelo, int cv, int consumo, int plazas, float precio) {
        return new ToyotaGasolina(marca, modelo, cv, consumo, plazas, precio);
    }

    @Override
    public Electrico creaElectrico(String marca, String modelo, int cv, int autonomia, int tiempoRecarga, int plazas, float precio) {
        return new ToyotaElectrico(marca, modelo, cv, autonomia, tiempoRecarga, plazas, precio);
    }

    @Override
    public Hibrido creaHibrido(String marca, String modelo, int cv, int consumo, int autonomiaElectrica, int plazas, float precio) {
        return new ToyotaHibrido(marca, modelo, cv, consumo, autonomiaElectrica, plazas, precio);
    }
    
}
