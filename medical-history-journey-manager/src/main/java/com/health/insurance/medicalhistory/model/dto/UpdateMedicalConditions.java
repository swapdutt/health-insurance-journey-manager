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
public class UpdateMedicalConditions {

    Boolean personalMedicalConditionsIndicator;
    List<PersonalMedicalConditions> personalMedicalConditionsList;
    Boolean labTestsIndicator;
    LabTests labTests;
    Boolean lifestyleIndicator;
    Lifestyle lifestyle;

}
