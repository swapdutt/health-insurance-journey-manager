package com.health.insurance.medicalhistory.model.dto;

import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateMedicalConditions {

    Integer medicalConditionsId = 0;
    Boolean personalMedicalConditionsIndicator = false;
    List<PersonalMedicalConditions> personalMedicalConditionsList = null;
    Boolean labTestsIndicator = false;
    LabTests labTests = null;
    Boolean lifestyleIndicator = false;
    Lifestyle lifestyle = null;

}
