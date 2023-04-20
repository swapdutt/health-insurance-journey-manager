package com.health.insurance.medicalhistory.model.utility.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

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
    Integer id;
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

}
