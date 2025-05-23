package com.example.udla.edu.ec.service;

import com.example.udla.edu.ec.model.Afiliacion;
import com.example.udla.edu.ec.repository.AfiliacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfiliacionService {

    @Autowired
    private AfiliacionRepository afiliacionRepository;

    public List<Afiliacion> getAll() {
        return afiliacionRepository.findAll();
    }

    public Optional<Afiliacion> getById(Long id) {
        return afiliacionRepository.findById(id);
    }

    public Afiliacion save(Afiliacion afiliacion) {
        return afiliacionRepository.save(afiliacion);
    }

    public void delete(Long id) {
        afiliacionRepository.deleteById(id);
    }
}
