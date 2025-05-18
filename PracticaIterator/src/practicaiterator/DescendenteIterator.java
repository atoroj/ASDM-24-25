/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaiterator;

import java.util.List;

/**
 *
 * @author Antonio
 */
public class DescendenteIterator implements I_PizzaIterator {
    List<I_Pizza> pizzas;
    List<I_Pizza> ordenadas;
    int posicion;
    
    public DescendenteIterator(List<I_Pizza> pizzas){
        this.posicion = 0;
        ordenadas = pizzas;
        ordenadas.sort((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()));
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
