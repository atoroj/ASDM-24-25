/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprototype;

/**
 *
 * @author Antonio
 */
public class PersonaFamiliar implements IPersona {

    String nombre, apellidos, direccion, email, nivelEstudios;
    int telefono, cp;

    public PersonaFamiliar(){
    }
    
    public PersonaFamiliar(String nombre, String apellidos, String direccion, int cp, String email, String nivelEstudios, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cp = cp;
        this.email = email;
        this.nivelEstudios = nivelEstudios;
        this.telefono = telefono;
    }
    
    @Override
    public IPersona clonar() {
        IPersona personaFamiliar = new PersonaFamiliar();
        personaFamiliar.setApellidos(apellidos);
        personaFamiliar.setDireccion(direccion);
        personaFamiliar.setCp(cp);
        personaFamiliar.setTelefono(telefono);
        return personaFamiliar;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int getTelefono() {
        return telefono;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public int getCp() {
        return cp;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getNivelEstudios() {
        return nivelEstudios;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setNivelEstudios(String nvlEstudios) {
        this.nivelEstudios = nvlEstudios;
    }
}
