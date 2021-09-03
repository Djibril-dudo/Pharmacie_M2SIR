package com.example.Pharmacie_M2SIR.service;

import com.example.Pharmacie_M2SIR.entity.Medicament;

import java.util.List;

public interface MedicamentService {
    public Medicament saveMedicament(Medicament medi);
    public  void delete(Medicament medicament);
    public List<Medicament> liste();
    //il ya d'autre methode
}
