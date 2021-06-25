package com.example.institutoconfactory;

public class JefeDeDepartamento extends Instituto implements IInstituto{
    public JefeDeDepartamento(String nombre, TipoDirectivo cargo, int salario) {
        super(nombre, cargo, salario);
    }

    public JefeDeDepartamento() {
        super();
    }

    @Override
    public void actualizarDatos(TipoDirectivo tipoDirectivo, String nombre, Double salario) {

    }
}
