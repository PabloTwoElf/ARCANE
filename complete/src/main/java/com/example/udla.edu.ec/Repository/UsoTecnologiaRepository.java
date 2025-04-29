package com.example.udla.edu.ec.Repository;
import com.example.udla.edu.ec.model.UsoTecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoTecnologiaRepository extends JpaRepository<UsoTecnologia, Long> {
}
