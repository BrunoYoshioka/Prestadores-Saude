package com.gft.sas.prestadoressaude.controller;

import com.gft.sas.prestadoressaude.model.Prestador;
import com.gft.sas.prestadoressaude.services.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/prestadores")
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer id){
        Prestador obj = prestadorService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
