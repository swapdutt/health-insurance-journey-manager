package com.health.insurance.insuredmember.model.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateInsuredMember {

    String firstName;
    String middleName;
    String lastName;
    String gender;
    LocalDate dateOfBirth;
    Integer age;
    Integer height;
    Double weight;
    Double bodyMassIndex;
    String relationshipWithProposer;
    String profession;
    String maritalStatus;
    Double monthlyIncome;
    String idProof;
    String idProofNumber;
    String nationality;
    Boolean riderRequested;
    Double sumInsured;
    Double riderSumInsured;
    String countryCode;
    String mobileNumber;
    Boolean medicalHistoryQuestion;

}
