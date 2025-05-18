/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practicaiterator;

/**
 *
 * @author Antonio
 */
public interface I_PizzeriaFacade {
    public I_Cliente iniciarCliente();
    public I_Cliente registrarCliente();
    public void mostrarMenu();
    public void agregarPizzaAlCatalogo(I_Cliente cliente);
    public int iniciarPedido(I_Cliente cliente);
    public void agregarPizzaAlPedido(int pedido);
    public void verPedido(int pedido);
    public void finalizarPedido(int pedido);
    public I_PizzaIterator creaIterador(String tipo);
}
