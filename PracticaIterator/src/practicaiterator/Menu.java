package practicaiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu implements I_Menu {

    String fecha_actualizacion;
    private I_Pizza[] menu = new Pizza[10];

    int cantidad;

    public Menu() {
        menu[0] = new Pizza("Margarita", "Queso", "Tomate", "Albahaca", 10);
        menu[1] = new Pizza("Pepperoni", "Queso", "Tomate", "Pepperoni", 12);
        menu[2] = new Pizza("Hawaiana", "Queso", "Jamón", "Piña", 14);

        cantidad = 3;
    }

    public void actualizaMenu() {
        Scanner sc = new Scanner(System.in);
        String nombre, i1, i2, i3;
        Pizza p;

        if (cantidad < 10) {
            System.out.println("Introduzca nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca ingrediente: ");
            i1 = sc.nextLine();
            System.out.println("Introduzca ingrediente: ");
            i2 = sc.nextLine();
            System.out.println("Introduzca ingrediente: ");
            i3 = sc.nextLine();
            p = new Pizza(nombre, i1, i2, i3, 9);

            menu[cantidad++] = p;
        } else {
            System.out.println("El Menu esta completo");
        }
    }

    public void muestraMenu() {
        for (int i = 0; i < cantidad; i++) {
            menu[i].mostrar_Descripcion();
        }
    }

    @Override
    public I_Pizza escogerPizza() {
        Scanner sc = new Scanner(System.in);
        int tipo;
        System.out.println("Qué modelo de pizza quiere: ");
        muestraMenu();
        do {
            System.out.println("Elija un número de las pizzas mostradas 0 a " + (cantidad - 1));
            tipo = sc.nextInt();
            if (tipo < 0 || tipo >= cantidad) {
                System.out.println("Error: Pizza no existente. Intente de nuevo.");
            }
        } while (tipo < 0 || tipo >= cantidad);
        return menu[tipo];

    }

    @Override
    public List<I_Pizza> listarMenu() {
        List<I_Pizza> pizzas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            pizzas.add(menu[i]);
        }
        return pizzas;
    }
}
