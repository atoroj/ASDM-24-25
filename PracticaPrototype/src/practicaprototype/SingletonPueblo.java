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
public class SingletonPueblo {
    private static SingletonPueblo pueblo = new SingletonPueblo();
    private ArrayList<Familia> familias;
    
    private SingletonPueblo(){
        familias = new ArrayList<>();
    }
    
    public static SingletonPueblo obtenerPueblo(){
        return pueblo;
    }
    
     public void agregarFamilia(Familia familia) {
        familias.add(familia);
    }

    public ArrayList<Familia> getFamilias() {
        return familias;
    }

    public void mostrarPueblo() {
        for (Familia f : familias) {
            f.mostrarMiembros();
        }
    }
}
