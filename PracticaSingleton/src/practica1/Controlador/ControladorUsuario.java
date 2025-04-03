/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import practica1.Modelo.Avion;
import practica1.Modelo.Usuario;
import practica1.Vista.VistaAvion;
import practica1.Vista.VistaLogin;

/**
 *
 * @author Antonio
 */
public class ControladorUsuario {
    private Avion avion;
    private VistaAvion vistaAvion;
    private VistaLogin vista;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private int nBilletesTotalesVendidos;
    private static final String FICHERO = "usuarios.txt";

    public ControladorUsuario() {
        avion = avion.obtenerAvion();
        nBilletesTotalesVendidos = 0;
        cargarUsuarios();
        vista = new VistaLogin(this);
        vista.setVisible(true);
    }

    public void guardarUsuario(Usuario usuario) {
        try (FileWriter fw = new FileWriter(FICHERO, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw)){
            pw.println(usuario.getNombre() + ";" + usuario.getPwd() + ";" + usuario.getnBilletes());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void guardarUsuarios(){
        try (FileWriter fw = new FileWriter(FICHERO);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw)){
            for (Usuario usuario : listaUsuarios) {
                pw.println(usuario.getNombre() + ";" + usuario.getPwd() + ";" + usuario.getnBilletes());
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarUsuarios() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    listaUsuarios.add(new Usuario(partes[0], partes[1], Integer.parseInt(partes[2])));
                    nBilletesTotalesVendidos += Integer.parseInt(partes[2]);
                }
            }
            avion.restaBilletesComprados(nBilletesTotalesVendidos);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean registrarUsuario(String nombre, String pwd) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return false;
            }
        }
        Usuario nuevoUsuario = new Usuario(nombre, pwd, 0);
        listaUsuarios.add(nuevoUsuario);
        guardarUsuario(nuevoUsuario);
        vista.mostrarError("Usuario registrado con éxito");
        return true;
    }

    public void iniciarSesion(String nombre, String pwd) {
        boolean correcto = false;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.autenticar(nombre, pwd)) {
                correcto = true;
                vista.dispose();
                this.vistaAvion = new VistaAvion(usuario, this);
                this.vistaAvion.setVisible(true);
            }
        }
        if(!correcto){
            vista.mostrarError("Usuario o contraseña incorrectos");
        }   
    }
    
    public void cerrarSesion(){
        guardarUsuarios();
        this.vistaAvion.dispose();
    }
}
