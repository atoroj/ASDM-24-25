/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practicaprototype;

/**
 *
 * @author Antonio
 */
public interface IPersona {
    public String getNombre();
    public String getApellidos();
    public int getTelefono();
    public String getDireccion();
    public int getCp();
    public String getEmail();
    public String getNivelEstudios();
    public void setNombre(String nombre);
    public void setApellidos(String apellidos);
    public void setTelefono(int telefono);
    public void setDireccion(String direccion);
    public void setCp(int cp);
    public void setEmail(String email);
    public void setNivelEstudios(String nvlEstudios);
    public IPersona clonar();
}
