package com.PrestaBanco.monolitico.repositories;

import com.PrestaBanco.monolitico.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {
    public DocumentEntity findByRut(String rut);
    List<DocumentEntity> findByCategory(String category);
    @Query(value = "SELECT * FROM employees WHERE employees.rut = :rut", nativeQuery = true)
    DocumentEntity findByRutNativeQuery(@Param("rut") String rut);
}