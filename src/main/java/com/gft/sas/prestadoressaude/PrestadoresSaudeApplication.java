package com.gft.sas.prestadoressaude;

import com.gft.sas.prestadoressaude.model.Prestador;
import com.gft.sas.prestadoressaude.repositories.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PrestadoresSaudeApplication implements CommandLineRunner {

	@Autowired
	private PrestadorRepository prestadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrestadoresSaudeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Prestador p1 = new Prestador(null, "Ana");
		p1.getEspecialidades().addAll(Arrays.asList("Cardiologia", "Oftalmologia", "Psiquiatria"));
        Prestador p2 = new Prestador(null, "João");
        p2.getEspecialidades().addAll(Arrays.asList("Podologia", "Ortopedia"));
        Prestador p3 = new Prestador(null, "Fabio");
        p3.getEspecialidades().addAll(Arrays.asList("Ortopedia"));
        Prestador p4 = new Prestador(null, "Bruno");
        p4.getEspecialidades().addAll(Arrays.asList("Ortopedia, Oftalmologia"));
        Prestador p5 = new Prestador(null, "Felipe");
        p5.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Podologia"));
        Prestador p6 = new Prestador(null, "Diego");
        p6.getEspecialidades().addAll(Arrays.asList("Oftalmologia"));
        Prestador p7 = new Prestador(null, "Renato");
        p7.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p8 = new Prestador(null, "Vitor");
        p8.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Psiquiatria"));
        Prestador p9 = new Prestador(null, "Carolina");
        p9.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Dermatologia"));
        Prestador p10 = new Prestador(null, "Ana Paula");
        p10.getEspecialidades().addAll(Arrays.asList("Dermatologia", "Ortopedia"));
        Prestador p11 = new Prestador(null, "Fernando");
        p11.getEspecialidades().addAll(Arrays.asList("Oftalmologia"));
        Prestador p12 = new Prestador(null, "Guilherme");
        p12.getEspecialidades().addAll(Arrays.asList("Oftalmologia"));
        Prestador p13 = new Prestador(null, "Carlos");
        p13.getEspecialidades().addAll(Arrays.asList("Psiquiatria"));
        Prestador p14 = new Prestador(null, "Paula");
        p14.getEspecialidades().addAll(Arrays.asList("Cardiologia", "Dermatologia"));
        Prestador p15 = new Prestador(null, "Leandro");
        p15.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p16 = new Prestador(null, "Lucas");
        p16.getEspecialidades().addAll(Arrays.asList("Dermatologia", "Pediatria"));
        Prestador p17 = new Prestador(null, "Rafael");
        p17.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p18 = new Prestador(null, "Silvia");
        p18.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Pediatria", "Ortopedia"));
        Prestador p19 = new Prestador(null, "Camila");
        p19.getEspecialidades().addAll(Arrays.asList("Cardiologia", "Ortopedia"));
        Prestador p20 = new Prestador(null, "Hingrid");
        p20.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p21 = new Prestador(null, "Renan");
        p21.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Pediatria"));
        Prestador p22 = new Prestador(null, "Ronaldo");
        p22.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p23 = new Prestador(null, "Augusto");
        p23.getEspecialidades().addAll(Arrays.asList("Ortopedia"));
        Prestador p24 = new Prestador(null, "Claudio");
        p24.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Ortopedia"));
        Prestador p25 = new Prestador(null, "Eliza");
        p25.getEspecialidades().addAll(Arrays.asList("Oftalmologia", "Pediatria", "Ortopedia"));

        prestadorRepository.saveAll(Arrays.asList(
                p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
                p21, p22, p23, p24, p25));
	}
}
