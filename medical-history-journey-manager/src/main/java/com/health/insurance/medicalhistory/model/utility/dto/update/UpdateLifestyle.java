package com.health.insurance.medicalhistory.model.utility.dto.update;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateLifestyle {

    Boolean tobaccoOrAlcoholConsumption;
    Integer alcoholConsumptionPerDay;
    Integer panMasalaConsumptionPerDay;
    Integer smokingConsumptionPerDay;
    Integer totalYearsOfSmoking;

}
