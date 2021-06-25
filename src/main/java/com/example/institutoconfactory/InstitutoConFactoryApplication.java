package com.example.institutoconfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstitutoConFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstitutoConFactoryApplication.class, args);

    {
        TipoDirectivo tipoDirectivo = TipoDirectivo.DOCENTE;
        String nombre = "pablo";
        Double salario = 8.50;

        IInstituto empleado = InstitutoFactory.getDirectivo(tipoDirectivo, nombre, salario);

        System.out.println("Soy "+empleado.getNombre());
        System.out.println(empleado);

    }
    }

    }

