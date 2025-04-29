package com.example.udla.edu.ec.Repository;


import com.example.udla.edu.ec.model.Afiliacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliacionRepository extends JpaRepository<Afiliacion, Long> {
}
