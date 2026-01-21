package org.example;

import org.example.Services.ImportarDatos;
import org.example.Services.PaisServices;
import org.example.Services.PresidenteServices;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Secuencia {


    @Autowired
    PresidenteServices presiserv;
    @Autowired
    PaisServices ps;
    @Autowired
    ImportarDatos id;
    public void exameSolucion() {


        // 1
        System.out.println("Execución Exercicio 1");


        id.importarPresidentes("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Presidente.JSON");
        id.importarPaises("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Pais.JSON");

        System.out.println("FIN Exercicio 1");

        // 2
        System.out.println("Execución Exercicio 2");

        ps.listarPaises();

        presiserv.listarPresidentes();


        for (Pais p : ps.listarPaises()){
            S
        }


        System.out.println("FIN Exercicio 2");

        // 3
        System.out.println("Execución Exercicio 3");

        System.out.println("FIN Exercicio 3");

        // 4
        System.out.println("Execución Exercicio 4");

        System.out.println("FIN Exercicio 4");

        // 5
        System.out.println("Execución Exercicio 5");

        System.out.println("FIN Exercicio 5");

        // 6
        System.out.println("Execución Exercicio 6");

        System.out.println("FIN Exercicio 6");

        // 7
        System.out.println("Execución Exercicio 7");

        System.out.println("FIN Exercicio 7");
    }
}
