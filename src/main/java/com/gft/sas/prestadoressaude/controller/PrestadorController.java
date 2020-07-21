package com.gft.sas.prestadoressaude.controller;

import com.gft.sas.prestadoressaude.model.Especialidade;
import com.gft.sas.prestadoressaude.model.Prestador;
import com.gft.sas.prestadoressaude.services.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping(value = "/prestadores")
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    /*@GetMapping
    public List<Prestador> listAll(){
        return asList(
                new Prestador(1, "Ana"),
                new Prestador(2, "João"),
                new Prestador(3, "Fabio"),
                new Prestador(4, "Bruno"),
                new Prestador(5, "Felipe"),
                new Prestador(6, "Diego"),
                new Prestador(7, "Renato"),
                new Prestador(8, "Vitor"),
                new Prestador(9, "Carolina"),
                new Prestador(10, "Ana Paula"),
                new Prestador(11, "Fernando"),
                new Prestador(12, "Guilherme"),
                new Prestador(13, "Carlos"),
                new Prestador(14, "Paula"),
                new Prestador(15, "Leandro"),
                new Prestador(16, "Lucas"),
                new Prestador(17, "Rafael"),
                new Prestador(18, "Silvia"),
                new Prestador(19, "Camila"),
                new Prestador(20, "Hingrid"),
                new Prestador(21, "Renan"),
                new Prestador(22, "Ronaldo"),
                new Prestador(23, "Augusto"),
                new Prestador(24, "Claudio"),
                new Prestador(25, "Eliza"));
    }*/

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer id){
        Prestador obj = prestadorService.buscar(id);
        return ResponseEntity.ok().body(obj);

        /*Prestador p1 = new Prestador(1, "Ana");
        Prestador p2 = new Prestador(2, "João");
        Prestador p3 = new Prestador(3, "Fabio");
        Prestador p4 = new Prestador(4, "Bruno");
        Prestador p5 = new Prestador(5, "Felipe");
        Prestador p6 = new Prestador(6, "Diego");
        Prestador p7 = new Prestador(7, "Renato");
        Prestador p8 = new Prestador(8, "Vitor");
        Prestador p9 = new Prestador(9, "Carolina");
        Prestador p10 = new Prestador(10, "Ana Paula");
        Prestador p11 = new Prestador(11, "Fernando");
        Prestador p12 = new Prestador(12, "Guilherme");
        Prestador p13 = new Prestador(13, "Carlos");
        Prestador p14 = new Prestador(14, "Paula");
        Prestador p15 = new Prestador(15, "Leandro");
        Prestador p16 = new Prestador(16, "Lucas");
        Prestador p17 = new Prestador(17, "Rafael");
        Prestador p18 = new Prestador(18, "Silvia");
        Prestador p19 = new Prestador(19, "Camila");
        Prestador p20 = new Prestador(20, "Hingrid");
        Prestador p21 = new Prestador(21, "Renan");
        Prestador p22 = new Prestador(22, "Ronaldo");
        Prestador p23 = new Prestador(23, "Augusto");
        Prestador p24 = new Prestador(24, "Claudio");
        Prestador p25 = new Prestador(25, "Eliza");

        List<Prestador> lista = new ArrayList<Prestador>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);
        lista.add(p11);
        lista.add(p12);
        lista.add(p13);
        lista.add(p14);
        lista.add(p15);
        lista.add(p16);
        lista.add(p17);
        lista.add(p18);
        lista.add(p19);
        lista.add(p20);
        lista.add(p21);
        lista.add(p22);
        lista.add(p23);
        lista.add(p24);
        lista.add(p25);

        return lista;*/
        //Especialidade e1 = new Especialidade();
    }
}
