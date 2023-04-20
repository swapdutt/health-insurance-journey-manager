package com.health.insurance.medicalhistory.model.utility.dto.create;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateLifestyle {

    Integer lifestyleId = 0;
    Boolean tobaccoOrAlcoholConsumption = false;
    Integer alcoholConsumptionPerDay = 0;
    Integer panMasalaConsumptionPerDay = 0;
    Integer smokingConsumptionPerDay = 0;
    Integer totalYearsOfSmoking = 0;

}
