/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacommand.Command;

import practicacommand.I_Pedido;

/**
 *
 * @author Antonio
 */
public abstract class SolicitudPizzeria implements ISolicitud {
    @Override
    public void ejecutarMesa() {
        pedirACocina();
        servirEnMesa();
    }
    
    @Override
    public void ejecutarDomicilio(){
        pedirACocina();
        pedidoDomicilio();
    }
    
    @Override
    public void ejecutarRecoger(){
        pedirACocina();
        pedidoRecoger();
    }
    
    public abstract void pedirACocina();
    public abstract void servirEnMesa();
    public abstract void pedidoDomicilio();
    public abstract void pedidoRecoger();
}
