package com.example.Pharmacie_M2SIR.service;

import com.example.Pharmacie_M2SIR.dao.MedicamentRepository;
import com.example.Pharmacie_M2SIR.entity.Medicament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicamentServiceImpl implements  MedicamentService{
    @Autowired
    private MedicamentRepository medicamentRepository;
    @Override
    public Medicament saveMedicament(Medicament medicament) {
        return this.medicamentRepository.save(medicament);
    }

    @Override
    public void delete(Medicament medicament) {

    }

    @Override
    public List<Medicament> liste() {
        return medicamentRepository.findAll();
    }
}
