package com.health.insurance.medicalhistory.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "medical_conditions")
public class MedicalConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    Integer id;
    Integer medicalConditionsId;
    Boolean personalMedicalConditionsIndicator;
    List<PersonalMedicalConditions> personalMedicalConditionsList = null;
    Boolean labTestsIndicator;

    @OneToOne
    @JoinColumn(name = "lab_tests_id")
    LabTests labTests = null;
    Boolean lifestyleIndicator;

    @OneToOne
    @JoinColumn(name = "lifestyle_id")
    Lifestyle lifestyle = null;

}
