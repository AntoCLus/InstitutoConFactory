package com.example.institutoconfactory;

public interface IInstituto {
    String getNombre();
    TipoDirectivo getCargo();
    int getSalario();

    void actualizarDatos(TipoDirectivo tipoDirectivo, String nombre, Double salario);

}

