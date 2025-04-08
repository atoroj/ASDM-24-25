/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaabstractfactory.marcas.ford;

import practicaabstractfactory.componentes.Ford;

/**
 *
 * @author Antonio
 */
public class FordDiesel extends Ford {

    public FordDiesel(String modelo, String tipo, int cv, int consumo, int plazas, float precio, float cc) {
        super(modelo, tipo, cv, consumo, plazas, precio, cc);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Automovil gasolina");
    }
    
}
