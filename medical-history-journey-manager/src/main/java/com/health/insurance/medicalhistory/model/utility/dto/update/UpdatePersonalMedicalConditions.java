package com.health.insurance.medicalhistory.model.utility.dto.update;

import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdatePersonalMedicalConditions {

    DiseaseQuestionnaire diseaseQuestionnaire;
    String nameOfDisease;
    String typeOfDisease;
    String typeOfTreatment;
    String currentStatusOfTreatment;
    String typeOfComplication;
    String typeOfBiopsy;
    LocalDate lastConsultationDate;
    Integer diagnosisYear;

}
