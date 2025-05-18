/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacommand;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import practicacommand.Command.ISolicitud;
import practicacommand.Command.SolicitudesPizzeria;

/**
 *
 * @author Antonio
 */
public class PizzeriaFacade implements I_PizzeriaFacade {

    private I_Menu menu;
    private ArrayList<I_Cliente> clientesRegistrados;
    private ArrayList<I_Pedido> pedidos;
    private Scanner sc;

    public PizzeriaFacade() {
        this.menu = new Menu();
        this.clientesRegistrados = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    @Override
    public I_Cliente iniciarCliente() {
        System.out.println("---Iniciando cliente---");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la contraseña del cliente: ");
        String pwd = sc.nextLine();
        for (I_Cliente cliente : clientesRegistrados) {
            if (nombre.equals(cliente.getNombre()) && pwd.equals(cliente.getPwd())) {
                cliente.mostrarCliente();
                return cliente;
            }
        }
        System.out.println("Cliente no registrado, registrese primero");
        return null;
    }

    public I_Cliente registrarCliente() {
        System.out.println("---Registrando cliente---");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la contraseña del cliente: ");
        String pwd = sc.nextLine();
        System.out.print("Ingrese el tipo de cliente 'normal', 'vip': ");
        String tipo = sc.nextLine();
        Cliente nuevoCliente = new Cliente(nombre, pwd, tipo);
        clientesRegistrados.add(nuevoCliente);
        System.out.println("Cliente registrado con éxito:");
        nuevoCliente.mostrarCliente();
        return nuevoCliente;
    }

    @Override
    public void agregarPizzaAlCatalogo(I_Cliente cliente) {
        if (cliente.getTipo().equals("vip")) {
            System.out.println("\n¿Cuantas pizzas quieres en el menu?: ");
            int numPizzas = new java.util.Scanner(System.in).nextInt();

            for (int i = 0; i < numPizzas; i++) {
                System.out.println("---Añadir nueva pizza al catalogo---");
                menu.actualizaMenu();
            }
        } else {
            System.out.println("Debes ser cliente vip para agregar pizzas al catalogo");
        }
    }

    @Override
    public void mostrarMenu() {
        System.out.println("---Menu pizzeria---");
        menu.muestraMenu();
    }

    @Override
    public int iniciarPedido(I_Cliente cliente) {
        I_Pedido pedido;
        if (cliente == null) {
            System.out.println("Error: No se puede iniciar un pedido sin un cliente");
            return -1;
        } else {
            System.out.println("---Iniciando pedido---");
            pedido = new Pedido((Cliente) cliente);

            //Para ponerle la fecha actual
            Date fecha = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            pedido.setFecha_pedido(sdf.format(fecha));

            pedidos.add(pedido);
            System.out.println("Nuevo pedido iniciado para el cliente " + cliente.getNombre());
        }
        return pedidos.size() - 1;
    }

    @Override
    public void agregarPizzaAlPedido(int pedido) {
        if (pedido == -1) {
            System.out.println("Error: No hay ningún pedido activo");
        } else {
            System.out.println("---Añadir pizza al pedido---");
            I_Pizza pizzaSeleccionada = menu.escogerPizza();
            pedidos.get(pedido).añadir_Apedido(pizzaSeleccionada);
        }
    }

    @Override
    public void verPedido(int pedido) {
        System.out.println("---Detalles del pedido actual---");
        if (pedido == -1) {
            System.out.println("Error: No hay ningún pedido activo");
        } else {
            System.out.println("---Mostrando pedido actual---");
            pedidos.get(pedido).mostrar_Pedido();
        }
    }

    @Override
    public void finalizarPedido(int pedido) {
        System.out.println("---Finalizando pedido---");
        if (pedido == -1) {
            System.out.println("Error: No hay ningún pedido activo");
        } else {
            System.out.println("Pagando la cuenta...");
            pedidos.remove(pedido);
        }
    }

    @Override
    public IPizzaIterator creaIterador(String tipo) {
        switch (tipo) {
            case "cola":
                return new ColaIterator(menu.listarMenu());
            case "pila":
                return new PilaIterator(menu.listarMenu());
            case "precioasc":
                return new AscendenteIterator(menu.listarMenu());
            case "preciodesc":
                return new DescendenteIterator(menu.listarMenu());
            default:
                System.out.println("Opcion no valida");
                return null;
        }
    }

    @Override
    public ISolicitud crearSolicitudPedido(int numPedido) {
        I_Pedido pedido = pedidos.get(numPedido);
        ISolicitud solicitudPedido = new SolicitudesPizzeria(pedido);
        return solicitudPedido;
    }

}
