package com.example.institutoconfactory;

//Un instituto necesita modelar su
// sistema de gestión de empleados.
// Utilizar el método Factory para armar
// un esquema que permita crear objetos de tipo:- Docente- Directivo-
// Jefe de departamento- Administrativo
// Los objetos de
// cada clase deben poder indicar su cargo, salario y nombre.//

public abstract class Instituto implements IInstituto {
    private String nombre;
    private TipoDirectivo cargo;
    private int salario;



    public Instituto(String nombre, TipoDirectivo cargo, int salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Instituto() {

    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public TipoDirectivo getCargo() {
        return cargo;
    }

    public void setCargo(TipoDirectivo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}