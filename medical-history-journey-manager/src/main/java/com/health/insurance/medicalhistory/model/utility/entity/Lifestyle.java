package com.health.insurance.medicalhistory.model.utility.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

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
    String id = UUID.randomUUID().toString();
    Integer lifestyleId;
    Boolean tobaccoOrAlcoholConsumption;
    Integer alcoholConsumptionPerDay;
    Integer panMasalaConsumptionPerDay;
    Integer smokingConsumptionPerDay;
    Integer totalYearsOfSmoking;

    public Lifestyle(final Lifestyle lifestyle) {
        this.setLifestyleId(lifestyle.getLifestyleId());
        this.setTobaccoOrAlcoholConsumption(lifestyle.getTobaccoOrAlcoholConsumption());
        this.setAlcoholConsumptionPerDay(lifestyle.getAlcoholConsumptionPerDay());
        this.setPanMasalaConsumptionPerDay(lifestyle.getPanMasalaConsumptionPerDay());
        this.setSmokingConsumptionPerDay(lifestyle.getSmokingConsumptionPerDay());
        this.setTotalYearsOfSmoking(lifestyle.getTotalYearsOfSmoking());
    }

}
