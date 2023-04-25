package com.health.insurance.medicalhistory.model.utility.builder;

import com.health.insurance.medicalhistory.model.utility.dto.create.CreatePersonalMedicalConditions;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import org.springframework.stereotype.Component;

@Component
public class PersonalMedicalConditionsBuilder {

    public PersonalMedicalConditions buildFromRequest(CreatePersonalMedicalConditions request) {

        PersonalMedicalConditions personalMedicalConditions = new PersonalMedicalConditions();

        personalMedicalConditions.setPersonalMedicalConditionsId(request.getPersonalMedicalConditionsId());
        personalMedicalConditions.setDiseaseQuestionnaire(request.getDiseaseQuestionnaire());
        personalMedicalConditions.setNameOfDisease(request.getNameOfDisease());
        personalMedicalConditions.setTypeOfDisease(request.getTypeOfDisease());
        personalMedicalConditions.setTypeOfTreatment(request.getTypeOfTreatment());
        personalMedicalConditions.setCurrentStatusOfTreatment(request.getCurrentStatusOfTreatment());
        personalMedicalConditions.setTypeOfComplication(request.getTypeOfComplication());
        personalMedicalConditions.setTypeOfBiopsy(request.getTypeOfBiopsy());
        personalMedicalConditions.setLastConsultationDate(request.getLastConsultationDate());
        personalMedicalConditions.setDiagnosisYear(request.getDiagnosisYear());

        return personalMedicalConditions;

    }

}
