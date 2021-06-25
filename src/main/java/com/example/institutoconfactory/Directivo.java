package com.example.institutoconfactory;

public class Directivo extends Instituto implements IInstituto {
    public Directivo(String nombre, TipoDirectivo cargo, int salario) {
        super(nombre, cargo, salario);
    }

    public Directivo() {
        super();
    }

    @Override
    public void actualizarDatos(TipoDirectivo tipoDirectivo, String nombre, Double salario) {

    }
}
