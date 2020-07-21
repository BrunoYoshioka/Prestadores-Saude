package com.gft.sas.prestadoressaude.controller;

import com.gft.sas.prestadoressaude.model.Prestador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping(value = "/especialidade")
public class EspecialidadeController {
    @GetMapping
    public List<Prestador> listAll(){
        return asList(
                new Prestador(1, "Cardiologia"),
                new Prestador(2, "Dermatologia"),
                new Prestador(3, "Oftalmologia"),
                new Prestador(4, "Podologia"),
                new Prestador(5, "Psiquiatria"),
                new Prestador(6, "Pediatria"),
                new Prestador(7, "Ortopedia"));
    }
}
