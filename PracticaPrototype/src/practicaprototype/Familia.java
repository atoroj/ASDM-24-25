/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprototype;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class Familia {

    private String apellidoFamiliar;
    private ArrayList<IPersona> miembros;

    public Familia(String apellido) {
        this.miembros = new ArrayList<>();
        this.apellidoFamiliar = apellido;
    }

    public void agregarFamiliar(IPersona familiar) {
        miembros.add(familiar);
    }

    public String getApellidoFamiliar() {
        return apellidoFamiliar;
    }

    public ArrayList<IPersona> getMiembros() {
        return miembros;
    }

    public void mostrarMiembros() {
        System.out.println("Familia " + apellidoFamiliar + ":");
        for (IPersona p : miembros) {
            System.out.println(" - " + p.getNombre() + " " + p.getApellidos());
        }
    }
}
