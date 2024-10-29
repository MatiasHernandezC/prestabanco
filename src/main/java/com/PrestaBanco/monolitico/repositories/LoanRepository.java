package com.PrestaBanco.monolitico.repositories;

import com.PrestaBanco.monolitico.entities.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
    public LoanEntity findByRut(String rut);
    List<LoanEntity> findByCategory(String category);
    @Query(value = "SELECT * FROM employees WHERE employees.rut = :rut", nativeQuery = true)
    LoanEntity findByRutNativeQuery(@Param("rut") String rut);
}