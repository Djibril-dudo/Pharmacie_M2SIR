package com.example.Pharmacie_M2SIR.dao;

import com.example.Pharmacie_M2SIR.entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament,Long> {
}
