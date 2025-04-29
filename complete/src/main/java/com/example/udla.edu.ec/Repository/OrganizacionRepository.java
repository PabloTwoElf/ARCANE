package com.example.udla.edu.ec.Repository;
import com.example.udla.edu.ec.model.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrganizacionRepository extends JpaRepository<Organizacion, Long> {
}
