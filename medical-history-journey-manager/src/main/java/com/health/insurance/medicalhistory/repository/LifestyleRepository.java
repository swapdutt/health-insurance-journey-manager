package com.health.insurance.medicalhistory.repository;

import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LifestyleRepository extends JpaRepository<Lifestyle, Integer> {

    List<Lifestyle> findLifestyleListById(Integer lifestyleId);

}
