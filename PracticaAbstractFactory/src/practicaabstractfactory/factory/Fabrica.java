/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practicaabstractfactory.factory;

import practicaabstractfactory.componentes.Ford;
import practicaabstractfactory.componentes.Seat;
import practicaabstractfactory.componentes.Toyota;

/**
 *
 * @author Antonio
 */
public interface Fabrica {
    Ford creaFord(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc);
    Seat creaSeat(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc);
    Toyota creaToyota(String modelo, String tipo, int cv, int consumo, int autonomiaElectrica, int recarga, int plazas, float precio, float cc);
}
