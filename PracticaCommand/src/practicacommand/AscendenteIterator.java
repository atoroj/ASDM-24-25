/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacommand;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class AscendenteIterator implements IPizzaIterator {

    List<I_Pizza> pizzas;
    List<I_Pizza> ordenadas;
    int posicion;
    
    public AscendenteIterator(List<I_Pizza> pizzas){
        posicion = 0;
        ordenadas = pizzas;
        ordenadas.sort(Comparator.comparingDouble(I_Pizza::getPrecio));
        this.pizzas = ordenadas;
    }
    
    @Override
    public boolean tieneSiguiente() {
        if(posicion < pizzas.size()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public I_Pizza siguiente() {
        if(tieneSiguiente()){
            return pizzas.get(posicion++);
        }else{
            return null;
        }
    }

    @Override
    public I_Pizza anterior() {
        if(posicion > 0){
            return pizzas.get(posicion--);
        }else{
            return null;
        }
    }
}
