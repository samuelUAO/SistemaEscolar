/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SAMUEL
 */
public class Estudiante extends Persona {

    private String codigo;
    private String programa;

    public Estudiante(String nombre, String direccion,
                      String telefono, String fechaNacimiento,
                      String codigo, String programa) {

        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.programa = programa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()
                + "\nCódigo: " + codigo
                + "\nPrograma: " + programa;
    }
}