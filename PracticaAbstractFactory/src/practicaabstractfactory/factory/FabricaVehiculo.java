/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.componentes.Electrico;
import practicaabstractfactory.componentes.Diesel;
import practicaabstractfactory.componentes.Gasolina;
import practicaabstractfactory.componentes.Hibrido;

/**
 *
 * @author Antonio
 */
public interface FabricaVehiculo {
    Diesel creaDiesel(String marca, String modelo, int cv, int consumo, int plazas, float precio);
    Gasolina creaGasolina(String marca, String modelo, int cv, int consumo, int plazas, float precio);
    Electrico creaElectrico(String marca, String modelo, int cv, int autonomia, int tiempoRecarga, int plazas, float precio);
    Hibrido creaHibrido(String marca, String modelo, int cv, int consumo, int autonomiaElectrica, int plazas, float precio);
}
