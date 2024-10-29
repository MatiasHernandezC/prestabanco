package com.PrestaBanco.monolitico.services;

import com.PrestaBanco.monolitico.entities.LoanEntity;
import com.PrestaBanco.monolitico.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;

    public ArrayList<LoanEntity> getLoans(){
        return (ArrayList<LoanEntity>) loanRepository.findAll();
    }

    public LoanEntity saveLoan(LoanEntity loan){
        return loanRepository.save(loan);
    }

    public LoanEntity getLoanById(Long id){
        return loanRepository.findById(id).get();
    }

    public LoanEntity getLoanByRut(String rut){
        return loanRepository.findByRut(rut);
    }

    public LoanEntity updateLoan(LoanEntity loan) {
        return loanRepository.save(loan);
    }

    public boolean deleteLoan(Long id) throws Exception {
        try{
            loanRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}