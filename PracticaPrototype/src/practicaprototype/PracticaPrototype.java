/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprototype;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class PracticaPrototype {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        ArrayList<IPersona> personas = new ArrayList<>();
        SingletonPueblo pueblo = SingletonPueblo.obtenerPueblo();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir persona nueva");
            System.out.println("2. Añadir familiar (clonar)");
            System.out.println("3. Mostrar personas");
            System.out.println("4. Mostrar familias");
            System.out.println("5. Mostrar pueblo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scInt.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scString.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scString.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scString.nextLine();
                    System.out.print("Código postal: ");
                    int cp = scInt.nextInt();
                    System.out.print("Email: ");
                    String email = scString.nextLine();
                    System.out.print("Nivel de estudios: ");
                    String nivel = scString.nextLine();
                    System.out.print("Teléfono fijo: ");
                    int tel = scInt.nextInt();
                    IPersona personaNueva = new PersonaNueva(nombre, apellidos, direccion, email, nivel, tel, cp);
                    personas.add(personaNueva);
                    Familia familiaNueva = new Familia(personaNueva.getApellidos());
                    familiaNueva.agregarFamiliar(personaNueva);
                    pueblo.agregarFamilia(familiaNueva);
                    break;
                case 2:
                    if (personas.size() < 1) {
                        System.out.println("No hay personas existentes");
                    } else {
                        System.out.println("Seleccione una persona para clonar: ");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println(i + ". " + personas.get(i).getNombre() + " " + personas.get(i).getApellidos());
                        }

                        System.out.print("Numero: ");
                        int pos = scInt.nextInt();
                        if (pos < 0 || pos > personas.size()) {
                            System.out.println("Selecciona un número valido");
                        } else {
                            IPersona persona = personas.get(pos);
                            IPersona familiar = persona.clonar();

                            System.out.print("Nombre: ");
                            String nombreFamiliar = scString.nextLine();
                            System.out.print("Email: ");
                            String emailFamiliar = scString.nextLine();
                            System.out.print("Nivel estudios: ");

                            String nivelEstudiosFamiliar = scString.nextLine();
                            familiar.setNombre(nombreFamiliar);
                            familiar.setEmail(emailFamiliar);
                            familiar.setNivelEstudios(nivelEstudiosFamiliar);

                            for (Familia familia : pueblo.getFamilias()) {
                                if (familia.getApellidoFamiliar().equals(familiar.getApellidos())) {
                                    familia.agregarFamiliar(familiar);
                                    break;
                                }
                            }
                            personas.add(familiar);
                            System.out.println("Familiar añadido");
                        }
                    }
                    break;
                case 3:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas existentes");
                    } else {
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println(
                                    "Nombre: " + personas.get(i).getNombre()
                                    + ", Apellidos: " + personas.get(i).getApellidos()
                                    + ", Teléfono fijo: " + personas.get(i).getTelefono()
                                    + ", Dirección: " + personas.get(i).getDireccion()
                                    + ", CP: " + personas.get(i).getCp()
                                    + ", Email: " + personas.get(i).getEmail()
                                    + ", Nivel estudios: " + personas.get(i).getNivelEstudios()
                            );
                        }
                    }
                    break;
                case 4:
                    if (pueblo.getFamilias().isEmpty()) {
                        System.out.println("No hay familias existentes");
                    } else {
                        System.out.println("Seleccione una familia a mostrar: ");
                        for (int i = 0; i < pueblo.getFamilias().size(); i++) {
                            System.out.println(i + " Apellido familiar: " + pueblo.getFamilias().get(i).getApellidoFamiliar());
                        }
                        System.out.print("Numero: ");
                        int pos = scInt.nextInt();
                        if (pos < 0 || pos > pueblo.getFamilias().size()) {
                            System.out.println("Selecciona un número valido");
                        } else {
                            ArrayList<IPersona> miembros = pueblo.getFamilias().get(pos).getMiembros();
                            for (IPersona miembro : miembros) {
                                System.out.println(
                                        "Nombre: " + miembro.getNombre()
                                        + ", Apellidos: " + miembro.getApellidos()
                                        + ", Teléfono fijo: " + miembro.getTelefono()
                                        + ", Dirección: " + miembro.getDireccion()
                                        + ", CP: " + miembro.getCp()
                                        + ", Email: " + miembro.getEmail()
                                        + ", Nivel estudios: " + miembro.getNivelEstudios()
                                );
                            }
                        }
                    }
                    break;
                case 5:
                    pueblo.mostrarPueblo();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
            }
        }
    }

}
