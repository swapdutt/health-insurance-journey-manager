package com.health.insurance.insuredmember.model.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateInsuredMember {

    Integer memberId = 0;
    String firstName = null;
    String middleName = null;
    String lastName = null;
    String gender = null;
    LocalDate dateOfBirth = null;
    Integer age = 0;
    Integer height = 0;
    Double weight = 0.0;
    Double bodyMassIndex = 0.0;
    String relationshipWithProposer = null;
    String profession = null;
    String maritalStatus = null;
    Double monthlyIncome = 0.0;
    String idProof = null;
    String idProofNumber = null;
    String nationality = null;
    Boolean riderRequested = false;
    Double sumInsured = 0.0;
    Double riderSumInsured = 0.0;
    String countryCode = null;
    String mobileNumber = null;
    Boolean medicalHistoryQuestion = false;

}
