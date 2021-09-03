package com.example.Pharmacie_M2SIR;

import com.example.Pharmacie_M2SIR.entity.Medicament;
import com.example.Pharmacie_M2SIR.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmacieM2SirApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PharmacieM2SirApplication.class, args);
	}
	@Autowired
private MedicamentService medicamentService;
	@Override
	public void run(String... args) throws Exception {
medicamentService.saveMedicament(new Medicament(null,"aspirine",null,null,null));
		medicamentService.saveMedicament(new Medicament(null,"paracetamol",null,null,null));
		medicamentService.saveMedicament(new Medicament(null,"vaccin jhonson",null,null,null));
	medicamentService.liste().forEach(p->{
		System.out.println(p.toString());
	});
	}
//ici on peut faire les tests
	//avec l'interface CommandLineRunner pour tester les methode

}
