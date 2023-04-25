package com.health.insurance.medicalhistory.repository;

import com.health.insurance.medicalhistory.model.entity.MedicalConditions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalConditionsRepository extends JpaRepository<MedicalConditions, Integer> {

    List<MedicalConditions> findMedicalConditionsListById(Integer medicalConditionsId);

    MedicalConditions findMedicalConditionsById(Integer medicalConditionsId);

}
