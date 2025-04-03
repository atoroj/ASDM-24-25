/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import practica1.Modelo.Agencia;
import practica1.Modelo.Usuario;
import practica1.Modelo.Avion;
import java.util.Scanner;
import practica1.Controlador.ControladorUsuario;

/**
 *
 * @author Antonio
 */
public class Practica1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ControladorUsuario();
        
        /*Scanner sc = new Scanner(System.in);
        int opcion;
        int billetes;
        Avion avion = Avion.obtenerAvion();
        Usuario usuario = new Usuario();
        Agencia agencia = new Agencia();
        
        do{
            System.out.println("*********************************");
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Comprar asientos");
            System.out.println("2. Devolver asientos");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuantos asientos desea?");
                    billetes = sc.nextInt();
                    usuario.quieroComprarBilletes(billetes);
                    avion.cuantosAsientosQuedan();
                    break;
                case 2:
                    System.out.println("¿Cuantos billetes desea devolver?");
                    billetes = sc.nextInt();
                    agencia.quieroDevolverBilletes(billetes);
                    avion.cuantosAsientosQuedan();
                    break;
            }
        }while (opcion != 2);
        
        sc.close();*/
        
    }
    
}
