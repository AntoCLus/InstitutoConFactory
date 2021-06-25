package com.example.institutoconfactory;

public class Docente extends Instituto implements IInstituto {

    public Docente(String nombre, TipoDirectivo cargo, int salario) {
        super(nombre, cargo, salario);
    }

    public Docente() {
        super();
    }

    @Override
    public void actualizarDatos(TipoDirectivo tipoDirectivo, String nombre, Double salario) {

    }
}
