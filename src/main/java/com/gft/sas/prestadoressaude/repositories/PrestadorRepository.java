package com.gft.sas.prestadoressaude.repositories;

import com.gft.sas.prestadoressaude.model.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Integer> {
}
