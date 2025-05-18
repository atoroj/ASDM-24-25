/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacommand;
    
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Antonio
 */
public class PilaIterator implements IPizzaIterator {
    private Stack<I_Pizza> pizzas;
    
    public PilaIterator(List<I_Pizza> lista){
        pizzas = new Stack<>();
        for (I_Pizza pizza : lista) {
            pizzas.push(pizza);
        }
    }
    
    @Override
    public boolean tieneSiguiente() {
        return !pizzas.isEmpty();
    }

    @Override
    public I_Pizza siguiente() {
        if(tieneSiguiente()){
            return pizzas.pop();
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
