package practicafacade;

import java.util.Scanner;

public class PracticaFacade {

    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        int numPedido = -1;
        I_PizzeriaFacade pizzeria = new PizzeriaFacade();
        I_Cliente cliente = null;
        int opcMenu = -1;
        do {            
            System.out.println("** MENU PIZZERIA **\n1.- Registrar Cliente\n2.- Iniciar Sesion\n3.- Mostrar menu\n4.- Añadir pizza al catalogo\n5.- Iniciar pedido\n6.- Agregar pizza al pedido\n7.- Ver pedido\n8.- Terminar pedido\n0.- Salir");
            System.out.print("Elija opcion: ");
            opcMenu = scanInt.nextInt();
            while (opcMenu < 0 || opcMenu > 8) {
                System.out.println("Error al introducir opcion, introduzcala de nuevo:");
                opcMenu = scanInt.nextInt();
            }
            switch (opcMenu) {
                case 1:
                    cliente = pizzeria.registrarCliente();
                    break;
                case 2:
                    cliente = pizzeria.iniciarCliente();
                    break;
                case 3:
                    pizzeria.mostrarMenu();
                    break;
                case 4:
                    pizzeria.agregarPizzaAlCatalogo(cliente);
                    break;
                case 5:
                    numPedido = pizzeria.iniciarPedido(cliente);
                    break;
                case 6:
                    pizzeria.agregarPizzaAlPedido(numPedido);
                    break;
                case 7:
                    pizzeria.verPedido(numPedido);
                    break;
                case 8:
                    pizzeria.finalizarPedido(numPedido);
                    break;
            }
        } while (opcMenu != 0);
        
        /*Scanner sc=new Scanner(System.in);
        I_Menu menu=new Menu();
        String seguir;
        I_Cliente[] clientes = new Cliente[10];
        int c=0;
        System.out.println("Creo un menú con solo dos pizzas");
        menu.actualizaMenu();
        menu.actualizaMenu();
        menu.muestraMenu();
        System.out.println("Creo un cliente y lo añado a la lista de clientes");
        Cliente clien=new Cliente("Juan", "123", "vip");
        clientes[c++]=clien;
        System.out.println("Creo un pedido nuevo con el cliente anterior\n");
        System.out.println("Lo suyo sería bucar que el cliente existe en la lista"
                + "y si no existe crear uno nuevo\n");
        I_Pedido pedido=new Pedido(clien);
        
        do{
            System.out.println("Estoy añadiendo una pizza al pedido");
            pedido.añadir_Apedido(menu.escogerPizza());
            
            System.out.println("¿Quiere añadir más pizzas?");
            seguir=sc.nextLine();
        }while(seguir.equalsIgnoreCase("Si"));
        pedido.mostrar_Pedido();
        pedido.tramitar_Pedido();        
    */
}
}
