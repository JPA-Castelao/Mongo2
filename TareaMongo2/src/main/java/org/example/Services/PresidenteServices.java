package org.example.Services;


import org.example.Repository.PresidenteRepository;
import org.example.model.Presidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresidenteServices {


    @Autowired
    private PresidenteRepository prRepo;


    //Create
    public Presidente crearPresidente(Presidente presi) {
        return prRepo.save(presi);
    }

    //Read
    public Presidente buscarPresidenteID(String id) {
        return prRepo.findById(id).orElse(null);
    }

    public List<Presidente> listarPresidentes() {
        return prRepo.findAll();
    }

    //Update
    public Presidente actualizarPresidente(String id, Presidente prMod) {

        Presidente pr = prRepo.findById(id).orElseThrow(() -> new RuntimeException("Entrada no encontrada"));

        pr.setIdade(prMod.getIdade());
        pr.setPartido(prMod.getPartido());
        pr.setNome(prMod.getNome());

        return prRepo.save(pr);
    }

    //Delete
    public void borrarPresidente(String id) {
        prRepo.deleteById(id);
    }

    //Mostrar
    public void mostrarPresidente(Presidente pr) {

        System.out.println("Nome: " + pr.getNome());
        System.out.println("Idade : " + pr.getIdade());
        System.out.println("Partido : " + pr.getPartido());
    }
}
