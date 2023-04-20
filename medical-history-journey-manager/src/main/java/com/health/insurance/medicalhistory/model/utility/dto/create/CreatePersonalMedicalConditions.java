package com.health.insurance.medicalhistory.model.utility.dto.create;

import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.Month;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreatePersonalMedicalConditions {

    Integer personalMedicalConditionsId = 0;
    DiseaseQuestionnaire diseaseQuestionnaire = null;
    String nameOfDisease = null;
    String typeOfDisease = null;
    String typeOfTreatment = null;
    String currentStatusOfTreatment = null;
    String typeOfComplication = null;
    String typeOfBiopsy = null;
    LocalDate lastConsultationDate = LocalDate.of(1900, Month.JANUARY, 1);
    Integer diagnosisYear = 0;

}
