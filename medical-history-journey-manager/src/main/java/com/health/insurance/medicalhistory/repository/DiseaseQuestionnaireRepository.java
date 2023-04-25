package com.health.insurance.medicalhistory.repository;

import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseQuestionnaireRepository extends JpaRepository<DiseaseQuestionnaire, Integer> {

    List<DiseaseQuestionnaire> findDiseaseQuestionnaireListById(Integer diseaseQuestionnaireId);

}
