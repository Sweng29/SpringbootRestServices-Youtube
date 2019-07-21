package com.mantis.tech.service;

import com.mantis.tech.model.Manufacturer;
import com.mantis.tech.repository.ManufacturerRepository;
import com.mantis.tech.utils.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService implements GenericDAO<Manufacturer> {

    private ManufacturerRepository manufacturerRepository;

    public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public Manufacturer addOrUpdate(Manufacturer entity) {
        manufacturerRepository.save(entity);
        return entity;
    }

    @Override
    public Manufacturer getById(Long id) {
        return manufacturerRepository.findById(id).get();
    }

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return manufacturerRepository.deleteById(id);
    }
}
