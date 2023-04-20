package com.health.insurance.medicalhistory.model.utility.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "disease_questionnaire")
public class DiseaseQuestionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    Integer id;
    Integer diseaseQuestionnaireId;
    Boolean question1;
    Boolean question2;
    Boolean question3;
    Boolean question4;
    Boolean question5;
    Boolean question6;
    Boolean question7;
    Boolean question8;
    Boolean question9;
    Boolean question10;
    Boolean question11;
    Boolean question12;

    public DiseaseQuestionnaire(final DiseaseQuestionnaire diseaseQuestionnaire) {
        this.setDiseaseQuestionnaireId(diseaseQuestionnaire.getDiseaseQuestionnaireId());
        this.setQuestion1(diseaseQuestionnaire.getQuestion1());
        this.setQuestion2(diseaseQuestionnaire.getQuestion2());
        this.setQuestion3(diseaseQuestionnaire.getQuestion3());
        this.setQuestion4(diseaseQuestionnaire.getQuestion4());
        this.setQuestion5(diseaseQuestionnaire.getQuestion5());
        this.setQuestion6(diseaseQuestionnaire.getQuestion6());
        this.setQuestion7(diseaseQuestionnaire.getQuestion7());
        this.setQuestion8(diseaseQuestionnaire.getQuestion8());
        this.setQuestion9(diseaseQuestionnaire.getQuestion9());
        this.setQuestion10(diseaseQuestionnaire.getQuestion10());
        this.setQuestion11(diseaseQuestionnaire.getQuestion11());
        this.setQuestion12(diseaseQuestionnaire.getQuestion12());
    }

}
