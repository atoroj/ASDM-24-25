/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.Modelo;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Agencia {
    Avion avion;
    
    public Agencia(){
        avion = Avion.obtenerAvion();
    }
    
    public boolean quieroDevolverBilletes(Usuario usuario, int billetes){
        return avion.devuelveBilletes(usuario, billetes);
    }
}
