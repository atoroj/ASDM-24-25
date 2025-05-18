/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Antonio
 */
public class ColaIterator implements I_PizzaIterator {
    
    Queue<I_Pizza> pizzas;
   
    public ColaIterator(List<I_Pizza> listaPizzas){
        pizzas = new LinkedList<>();
         for (I_Pizza pizza : listaPizzas) {
            this.pizzas.add(pizza);
        }
    }
    
    @Override
    public boolean tieneSiguiente() {
        if(!pizzas.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public I_Pizza siguiente() {
        if(tieneSiguiente()){
            return pizzas.poll();
        }else{
            System.out.println("No hay más pizzas");
            return null;
        }
    }

    @Override
    public Pizza anterior() {
        return null;
    }
    
}
