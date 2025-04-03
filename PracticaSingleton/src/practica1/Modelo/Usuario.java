/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.Modelo;

/**
 *
 * @author Antonio
 */
public class Usuario {

    private Avion avion;

    private String nombre;
    private String pwd;
    private int nBilletes;

    public Usuario(String nombre, String pwd, int nBilletes) {
        this.avion = Avion.obtenerAvion();
        this.nombre = nombre;
        this.pwd = pwd;
        this.nBilletes = nBilletes;
    }

    public Usuario() {
        this.avion = Avion.obtenerAvion();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getPwd() {
        return pwd;
    }

    public int getnBilletes() {
        return nBilletes;
    }
    
    public void setnBilletes(int nBilletes) {
        this.nBilletes = nBilletes;
    }

    public boolean quieroComprarBilletes(int billetes) {
        this.nBilletes = nBilletes + billetes;
        return avion.vendeBilletes(this, billetes);
    }

    public boolean autenticar(String nombre, String pwd) {
        return this.nombre.equals(nombre) && this.pwd.equals(pwd);
    }


}
