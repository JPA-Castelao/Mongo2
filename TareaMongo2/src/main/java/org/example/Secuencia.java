package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Services.ImportarDatos;
import org.example.Services.PaisServices;
import org.example.Services.PresidenteServices;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class Secuencia {
    @Autowired
    PresidenteServices presiserv;
    @Autowired
    PaisServices ps;
    @Autowired
    ImportarDatos id;

    private Pais pais;
    private Presidente presidente;
    private ObjectMapper mapper;

    public Secuencia(PresidenteServices presidenteServices, PaisServices paisServices) {
        this.ps = paisServices;
        this.presiserv = presidenteServices;
        this.mapper = new ObjectMapper();
    }
//
//       try {
//           Pais paisJson = mapper.readValue(new File("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Pais.JSON"), Pais.class);
//           ps.crearPais(paisJson);
//       } catch (IOException e) {
//           System.err.println("casdadasdasd");
//       }
//
//        System.out.println(ps.buscarPorId("1"));


    public void exameSolucion() {


        // 1
        System.out.println("Execución Exercicio 1");

//
//        id.importarPresidentes("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Presidente.JSON");
//        id.importarPaises("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Pais.JSON");


        try {
            Pais paisJson = mapper.readValue(new File("/home/dam/ad/Mongo/TareaMongo2/src/main/resources/Pais.JSON"), Pais.class);
            ps.crearPais(paisJson);
        } catch (
                IOException e) {

            System.err.println("casdadasdasd");
        }


        System.out.println("FIN Exercicio 1");

        // 2
        System.out.println("Execución Exercicio 2");

        ps.listarPaises();

        presiserv.listarPresidentes();


        System.out.println(ps.buscarPorId("1"));

//
//        for (Pais p : ps.listarPaises()) {
//            ps.mostrarPais(p);
//        }
//
//        for (Presidente prs : presiserv.listarPresidentes()) {
//
//            presiserv.mostrarPresidente(prs);
//        }


        System.out.println("FIN Exercicio 2");


        // 3
        System.out.println("Execución Exercicio 3");
//
//        String[] ArrayAux;
//        pais = new Pais("Républica de California", "Républica federal",
//
//                ArrayAux = "PT,PEA,PSS".split(",\\s*")
//                , "3");
//
//        ps.actualizarPais("2", pais);

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
