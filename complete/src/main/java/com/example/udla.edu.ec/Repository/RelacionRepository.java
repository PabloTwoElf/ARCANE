package com.example.udla.edu.ec.Repository;
import com.example.udla.edu.ec.model.Relacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacionRepository extends JpaRepository<Relacion, Long> {
}
