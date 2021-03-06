/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.util.Calendar;

/**
 *
 * @author francobustos
 */
public class Cliente extends Grupo {

    private Calendar nacimiento;
    private String dni;
    private String nombre;
    private String nacionalidad;
    private boolean sexo;

    public Cliente() {
        nacimiento = Calendar.getInstance();
        dni = "";
        nombre = "";
        nacionalidad = "";
        sexo = false;
    }

    public Cliente(String nombre, String dni, String nacionalidad, Calendar nacimiento, boolean sexo) {
        this.nacimiento = nacimiento;
        this.dni = dni;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" + ", nombre=" + nombre + ", dni=" + dni  + "nacimiento=" + nacimiento.getTime() + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + '}';
    }

    

}
