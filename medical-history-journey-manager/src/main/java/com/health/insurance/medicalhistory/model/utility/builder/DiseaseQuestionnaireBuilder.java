package com.health.insurance.medicalhistory.model.utility.builder;

import com.health.insurance.medicalhistory.exception.InvalidRequestException;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.update.UpdateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import org.springframework.stereotype.Component;

@Component
public class DiseaseQuestionnaireBuilder {

    public DiseaseQuestionnaire buildFromRequest(CreateDiseaseQuestionnaire request) {

        DiseaseQuestionnaire diseaseQuestionnaire = new DiseaseQuestionnaire();

        diseaseQuestionnaire.setDiseaseQuestionnaireId(request.getDiseaseQuestionnaireId());
        diseaseQuestionnaire.setQuestion1(request.getQuestion1());
        diseaseQuestionnaire.setQuestion2(request.getQuestion2());
        diseaseQuestionnaire.setQuestion3(request.getQuestion3());
        diseaseQuestionnaire.setQuestion4(request.getQuestion4());
        diseaseQuestionnaire.setQuestion5(request.getQuestion5());
        diseaseQuestionnaire.setQuestion6(request.getQuestion6());
        diseaseQuestionnaire.setQuestion7(request.getQuestion7());
        diseaseQuestionnaire.setQuestion8(request.getQuestion8());
        diseaseQuestionnaire.setQuestion9(request.getQuestion9());
        diseaseQuestionnaire.setQuestion10(request.getQuestion10());
        diseaseQuestionnaire.setQuestion11(request.getQuestion11());
        diseaseQuestionnaire.setQuestion12(request.getQuestion12());

        return diseaseQuestionnaire;
    }

    public DiseaseQuestionnaire updateFromRequest(DiseaseQuestionnaire diseaseQuestionnaireToUpdate, UpdateDiseaseQuestionnaire request) {

        DiseaseQuestionnaire diseaseQuestionnaireAfterUpdate = new DiseaseQuestionnaire(diseaseQuestionnaireToUpdate);

        try {
            if (Boolean.TRUE.equals(request.getQuestion1())) {
                diseaseQuestionnaireAfterUpdate.setQuestion1(request.getQuestion1());
            }
            if (Boolean.TRUE.equals(request.getQuestion2())) {
                diseaseQuestionnaireAfterUpdate.setQuestion2(request.getQuestion2());
            }
            if (Boolean.TRUE.equals(request.getQuestion3())) {
                diseaseQuestionnaireAfterUpdate.setQuestion3(request.getQuestion3());
            }
            if (Boolean.TRUE.equals(request.getQuestion4())) {
                diseaseQuestionnaireAfterUpdate.setQuestion4(request.getQuestion4());
            }
            if (Boolean.TRUE.equals(request.getQuestion5())) {
                diseaseQuestionnaireAfterUpdate.setQuestion5(request.getQuestion5());
            }
            if (Boolean.TRUE.equals(request.getQuestion6())) {
                diseaseQuestionnaireAfterUpdate.setQuestion6(request.getQuestion6());
            }
            if (Boolean.TRUE.equals(request.getQuestion7())) {
                diseaseQuestionnaireAfterUpdate.setQuestion7(request.getQuestion7());
            }
            if (Boolean.TRUE.equals(request.getQuestion8())) {
                diseaseQuestionnaireAfterUpdate.setQuestion8(request.getQuestion8());
            }
            if (Boolean.TRUE.equals(request.getQuestion9())) {
                diseaseQuestionnaireAfterUpdate.setQuestion9(request.getQuestion9());
            }
            if (Boolean.TRUE.equals(request.getQuestion10())) {
                diseaseQuestionnaireAfterUpdate.setQuestion10(request.getQuestion10());
            }
            if (Boolean.TRUE.equals(request.getQuestion11())) {
                diseaseQuestionnaireAfterUpdate.setQuestion11(request.getQuestion11());
            }
            if (Boolean.TRUE.equals(request.getQuestion12())) {
                diseaseQuestionnaireAfterUpdate.setQuestion12(request.getQuestion12());
            }
        } catch (InvalidRequestException e) {
            throw new InvalidRequestException("The data set required to update the entity is empty or not in proper format");
        }


        return diseaseQuestionnaireAfterUpdate;

    }

}
