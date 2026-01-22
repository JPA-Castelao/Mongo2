package org.example.Services;

import org.example.Repository.PaisRepository;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServices {

    @Autowired
    private PaisRepository pRepo;

    //Create
    public Pais crearPais(Pais p) {
        return pRepo.save(p);
    }

    //Read

    public Pais buscarPorId(String id) {
        return pRepo.findById(id).orElse(null);
    }

    public List<Pais> listarPaises() {

        return pRepo.findAll();
    }

    //Update
    public Pais actualizarPais(String id, Pais paisMod) {

        Pais p = pRepo.findById(id).orElseThrow(() -> new RuntimeException("Entrada no encontrada"));
        p.setNome(paisMod.getNome());
        p.setOrganizacion(paisMod.getOrganizacion());
        p.setPartidos(paisMod.getPartidos());
        p.setId_presidente(paisMod.getId_presidente());

        return p;
    }

    //Delete
    public void borrarPais(String id) {
        pRepo.deleteById(id);
    }

    //Mostrar
    public void mostrarPais(Pais ps) {

        System.out.println("Nome: " + ps.getNome());
        System.out.println("Organizacion : " + ps.getOrganizacion());
        System.out.printf("Partidos : ");
        for (String s : ps.getPartidos()) {
            System.out.printf(" %s ", s);
        }
        System.out.println();

        System.out.println("ID Presidente : " + ps.getId_presidente());
    }

}
