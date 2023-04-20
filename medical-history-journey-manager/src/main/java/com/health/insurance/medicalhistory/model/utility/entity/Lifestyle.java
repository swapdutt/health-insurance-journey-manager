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
@Table(name = "lifestyle")
public class Lifestyle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    Integer id;
    Integer lifestyleId;
    Boolean tobaccoOrAlcoholConsumption;
    Integer alcoholConsumptionPerDay;
    Integer panMasalaConsumptionPerDay;
    Integer smokingConsumptionPerDay;
    Integer totalYearsOfSmoking;

}
