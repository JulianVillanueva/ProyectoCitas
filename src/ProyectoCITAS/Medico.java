
package ProyectoCITAS;

import java.util.List;


public class Medico {
    
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;

    public Medico(String nombre, String apellido, String especialidad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public static void add(Medico medico, List<Medico> medicos){
        medicos.add(medico);
    }
    
    
}
