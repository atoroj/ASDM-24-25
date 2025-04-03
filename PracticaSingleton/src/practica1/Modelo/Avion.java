/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.Modelo;

/**
 *
 * @author Antonio
 */
public final class Avion {

    private static final Avion avion = new Avion();
    private static int nAsientos;

    private Avion() {
        nAsientos = 180;
    }

    public static Avion obtenerAvion() {
        return avion;
    }

    public static boolean vendeBilletes(Usuario usuario, int billetes) {     
        if(nAsientos >= billetes){
                nAsientos -= billetes;
                usuario.setnBilletes(billetes);
                return true;
        }
        return false;
        
    }

    
    public static boolean devuelveBilletes(Usuario usuario, int billetes) {
        int nAsientosUsuario = usuario.getnBilletes();
        if(nAsientosUsuario < billetes){
            return false;
        }
        if(nAsientos < 180){
            nAsientos += billetes;
            usuario.setnBilletes(nAsientosUsuario - billetes);
            return true;
        }
        return false;
    }

    public static int cuantosAsientosQuedan() {
        System.out.println("Quedan: " + nAsientos);
        return nAsientos;
    }
    
    public static void restaBilletesComprados(int billetes){
        nAsientos -= billetes;
    }
}
