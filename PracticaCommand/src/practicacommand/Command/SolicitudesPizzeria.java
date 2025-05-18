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
public class SolicitudesPizzeria extends SolicitudPizzeria {

    I_Pedido pedido;

    public SolicitudesPizzeria(I_Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void pedirACocina() {
        System.out.print("Pidiendo pedido: ");
    }

    @Override
    public void servirEnMesa() {
        pedido.tramitar_Pedido();
        System.out.println("Sirviendo en mesa pedido: ");
        pedido.mostrar_Pedido();
    }

    @Override
    public void pedidoDomicilio() {
        pedido.tramitar_Pedido();
        System.out.println("Llevando a casa pedido: ");
        pedido.mostrar_Pedido();
    }

    @Override
    public void pedidoRecoger() {
        pedido.tramitar_Pedido();
        System.out.println("Pedido listo para recoger: ");
        pedido.mostrar_Pedido();
    }

}
