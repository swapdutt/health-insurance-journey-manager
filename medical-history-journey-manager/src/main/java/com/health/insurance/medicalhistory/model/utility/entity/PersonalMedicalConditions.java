package com.health.insurance.medicalhistory.model.utility.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "personal_medical_conditions")
public class PersonalMedicalConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    String id = UUID.randomUUID().toString();
    Integer personalMedicalConditionsId;

    @OneToOne
    @JoinColumn(name = "disease_questionnaire_id")
    DiseaseQuestionnaire diseaseQuestionnaire;
    String nameOfDisease;
    String typeOfDisease;
    String typeOfTreatment;
    String currentStatusOfTreatment;
    String typeOfComplication;
    String typeOfBiopsy;
    LocalDate lastConsultationDate;
    Integer diagnosisYear;

    public PersonalMedicalConditions(final PersonalMedicalConditions personalMedicalConditions) {
        this.setPersonalMedicalConditionsId(personalMedicalConditions.getPersonalMedicalConditionsId());
        this.setDiseaseQuestionnaire(personalMedicalConditions.getDiseaseQuestionnaire());
        this.setNameOfDisease(personalMedicalConditions.getNameOfDisease());
        this.setTypeOfDisease(personalMedicalConditions.getTypeOfDisease());
        this.setTypeOfTreatment(personalMedicalConditions.getTypeOfTreatment());
        this.setCurrentStatusOfTreatment(personalMedicalConditions.getCurrentStatusOfTreatment());
        this.setTypeOfComplication(personalMedicalConditions.getTypeOfComplication());
        this.setTypeOfBiopsy(personalMedicalConditions.getTypeOfBiopsy());
        this.setLastConsultationDate(personalMedicalConditions.getLastConsultationDate());
        this.setDiagnosisYear(personalMedicalConditions.getDiagnosisYear());
    }

}
