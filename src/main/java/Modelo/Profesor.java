/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author SAMUEL
 */
public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion,
                    String telefono, String fechaNacimiento,
                    String cedula, String area,
                    double salarioHora, int horasMes) {

        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public double calcularSalario() {
        double salarioBase = salarioHora * horasMes;
        return salarioBase * 1.30;
    }

    public double calcularPrestaciones() {
        return calcularSalario() * 0.19;
    }

    public double calcularCostoTotal() {
        return calcularSalario() + calcularPrestaciones();
    }

@Override
public String mostrarDatos() {
    NumberFormat moneda =
            NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-CO"));

    return super.mostrarDatos()
        + "\nCédula: " + cedula
        + "\nÁrea: " + area
        + "\nSalario total: " + moneda.format(calcularSalario())
        + "\nPrestaciones: " + moneda.format(calcularPrestaciones())
        + "\nCosto para el colegio: " + moneda.format(calcularCostoTotal());  
}}