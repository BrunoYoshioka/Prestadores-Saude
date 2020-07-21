package com.gft.sas.prestadoressaude.services;

import com.gft.sas.prestadoressaude.model.Prestador;
import com.gft.sas.prestadoressaude.repositories.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrestadorService {

    @Autowired
    private PrestadorRepository prestadorRepository;

    public Prestador buscar(Integer id){
        Optional<Prestador> obj = prestadorRepository.findById(id);
        return obj.orElse(null);
    }
}
