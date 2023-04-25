package com.health.insurance.medicalhistory.repository;

import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalMedicalConditionsRepository extends JpaRepository<PersonalMedicalConditions, Integer> {

    List<PersonalMedicalConditions> findPersonalMedicalConditionsListById(Integer personalMedicalConditionsId);

}
