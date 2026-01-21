package org.example.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Repository.PaisRepository;
import org.example.Repository.PresidenteRepository;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.time.Period;
import java.util.List;

@Service
public class ImportarDatos {
    @Autowired
    private PaisRepository paisRepo;
    @Autowired
    private PresidenteRepository presidenteRepo;

    @Autowired
    private ObjectMapper om = new ObjectMapper();

    public void importarPaises(String ruta) {
        //Leemos el archivo y lo convertimos a una lista de paises usando el ObjectMapper de Jackson
        try {
            List<Pais> listaPaises = om.readValue(
                    new File(ruta),
                    new TypeReference<List<Pais>>() {
                    });

            paisRepo.saveAll(listaPaises);
            System.out.println("Importacion de paises  exitosa");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public void importarPresidentes(String ruta) {
        //leemos el archivo con el ObjectWrapper de jackson y lo convertimos en una lista de ese tipo
        try {
            //TypeReference convierte la lista en una lista de Presidentes
            List<Presidente> listaPresidentes = om.readValue(
                    new File(ruta),
                    new TypeReference<List<Presidente>>() {
                    });

            presidenteRepo.saveAll(listaPresidentes);
            System.out.println("Importacion de presidentes  exitosa");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}