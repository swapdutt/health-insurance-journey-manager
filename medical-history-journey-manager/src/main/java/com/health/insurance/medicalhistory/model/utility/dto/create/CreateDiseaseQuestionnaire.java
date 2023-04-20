package com.health.insurance.medicalhistory.model.utility.dto.create;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateDiseaseQuestionnaire {

    Integer diseaseQuestionnaireId = 0;
    Boolean question1 = false;
    Boolean question2 = false;
    Boolean question3 = false;
    Boolean question4 = false;
    Boolean question5 = false;
    Boolean question6 = false;
    Boolean question7 = false;
    Boolean question8 = false;
    Boolean question9 = false;
    Boolean question10 = false;
    Boolean question11 = false;
    Boolean question12 = false;

}
