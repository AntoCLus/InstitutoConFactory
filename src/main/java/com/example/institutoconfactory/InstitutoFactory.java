package com.example.institutoconfactory;

public class InstitutoFactory {
    public static IInstituto getDirectivo (TipoDirectivo tipoDirectivo, String nombre, Double salario){
    IInstituto instituto = switch (tipoDirectivo){
        case DOCENTE -> new Docente();
        case DIRECTIVO -> new Directivo();
        case ADMINISTRATIVO -> new Administrativo();
        case JEFEDEDEPARTAMENTO -> new JefeDeDepartamento();
    };
        instituto.actualizarDatos(tipoDirectivo, nombre, salario);
        return instituto;
}
}

