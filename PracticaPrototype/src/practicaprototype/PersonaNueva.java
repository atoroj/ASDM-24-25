/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprototype;

/**
 *
 * @author Antonio
 */
public class PersonaNueva implements IPersona {
    
    String nombre, apellidos, direccion, email, nivelEstudios;
    int telefono, cp;

    public PersonaNueva(){}
    
    public PersonaNueva(String nombre, String apellidos, String direccion, String email, String nivelEstudios, int telefono, int cp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.nivelEstudios = nivelEstudios;
        this.telefono = telefono;
        this.cp = cp;
    }
    
    
    @Override
    public IPersona clonar() {
        IPersona personaNueva = new PersonaFamiliar();
        personaNueva.setApellidos(apellidos);
        personaNueva.setDireccion(direccion);
        personaNueva.setCp(cp);
        personaNueva.setTelefono(telefono);
        return personaNueva;
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
