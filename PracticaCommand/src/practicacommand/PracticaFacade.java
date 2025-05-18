package practicacommand;

import java.util.Scanner;
import practicacommand.Command.ISolicitud;

public class PracticaFacade {

    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        int numPedido = -1;
        I_PizzeriaFacade pizzeria = new PizzeriaFacade();
        I_Cliente cliente = null;
        boolean clienteIniciado = false;
        int opcMenu = -1;
        do {
            System.out.println("\n** MENU PIZZERIA **\n1.- Registrar Cliente\n2.- Iniciar Sesion\n3.- Mostrar menu\n4.- Añadir pizza al catalogo\n5.- Iniciar pedido\n6.- Agregar pizza al pedido\n7.- Ver pedido\n8.- Terminar pedido\n9.- Recorrer menu\n0.- Salir");
            System.out.print("Elija opcion: ");
            opcMenu = scanInt.nextInt();
            while (opcMenu < 0 || opcMenu > 9) {
                System.out.println("Error al introducir opcion, introduzcala de nuevo:");
                opcMenu = scanInt.nextInt();
            }
            switch (opcMenu) {
                case 1:
                    cliente = pizzeria.registrarCliente();
                    break;
                case 2:
                    cliente = pizzeria.iniciarCliente();
                    if (cliente != null) {
                        clienteIniciado = true;
                    }
                    break;
                case 3:
                    pizzeria.mostrarMenu();
                    break;
                case 4:
                    if (clienteIniciado) {
                        pizzeria.agregarPizzaAlCatalogo(cliente);
                    } else {
                        System.out.println("Debes iniciar sesión anteriormente");
                    }
                    break;
                case 5:
                    if (clienteIniciado) {
                        numPedido = pizzeria.iniciarPedido(cliente);
                    } else {
                        System.out.println("Debes iniciar sesión anteriormente");
                    }
                    break;
                case 6:
                    if (clienteIniciado) {
                        pizzeria.agregarPizzaAlPedido(numPedido);
                    } else {
                        System.out.println("Debes iniciar sesión anteriormente");
                    }
                    break;
                case 7:
                    if (clienteIniciado) {
                        pizzeria.verPedido(numPedido);
                    } else {
                        System.out.println("Debes iniciar sesión anteriormente");
                    }
                    break;
                case 8:
                    if (clienteIniciado) {
                        ISolicitud solicitudPedido = pizzeria.crearSolicitudPedido(numPedido);
                        System.out.println("¿Desea la pizza en mesa, domicilio o recoger?");
                        String opcion = scanString.nextLine();
                        switch (opcion) {
                            case "mesa":
                                System.out.println("Seleccionado a mesa: ");
                                solicitudPedido.ejecutarMesa();
                                break;
                            case "domicilio":
                                System.out.println("Seleccionado a domicilio: ");
                                solicitudPedido.ejecutarDomicilio();
                                break;
                            case "recoger":
                                System.out.println("Seleccionado a recoger: ");
                                solicitudPedido.ejecutarRecoger();
                                break;
                        }
                        pizzeria.finalizarPedido(numPedido);
                    } else {
                        System.out.println("Debes iniciar sesión anteriormente");
                    }
                    break;
                case 9:
                    System.out.println("Elija tipo de recorrido: cola, pila, precioasc, preciodesc");
                    String tipo = scanString.nextLine();
                    IPizzaIterator iterador = pizzeria.creaIterador(tipo);
                    while (iterador.tieneSiguiente()) {
                        System.out.println(iterador.siguiente());
                    }

                    break;
            }
        } while (opcMenu != 0);
    }
}
