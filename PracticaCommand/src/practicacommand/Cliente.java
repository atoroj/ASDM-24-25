
package practicacommand;

import java.util.Objects;


public class Cliente implements I_Cliente {
    String nombre;
    String pwd;
    String tipo;
    
    Cliente(String n, String pwd, String t){
        nombre=n;
        this.pwd=pwd;
        tipo=t;
    }
       
    @Override
    public void mostrarCliente(){
        System.out.println("El nombre del clienete es: " + nombre);
        System.out.println("\nEl tipo de Cliente es " + tipo+ "\n");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
