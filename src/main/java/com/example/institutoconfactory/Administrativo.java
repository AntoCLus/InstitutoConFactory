package com.example.institutoconfactory;

public class Administrativo extends Instituto implements IInstituto{
    public Administrativo(String nombre, TipoDirectivo cargo, int salario) {
        super(nombre, cargo, salario);
    }

    public Administrativo() {
        super();
    }

    @Override
    public void actualizarDatos(TipoDirectivo tipoDirectivo, String nombre, Double salario) {

    }
}
