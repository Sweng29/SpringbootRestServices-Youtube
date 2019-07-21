package com.mantis.tech.repository;

import com.mantis.tech.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Long, Manufacturer> {
}
