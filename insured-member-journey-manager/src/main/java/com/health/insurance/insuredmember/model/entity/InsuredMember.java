package com.health.insurance.insuredmember.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "insured_member")
public class InsuredMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    String id = UUID.randomUUID().toString();
    Integer memberId;
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

    public InsuredMember(final InsuredMember insuredMember) {
        this.setMemberId(insuredMember.getMemberId());
        this.setFirstName(insuredMember.getFirstName());
        this.setMiddleName(insuredMember.getMiddleName());
        this.setLastName(insuredMember.getLastName());
        this.setGender(insuredMember.getGender());
        this.setDateOfBirth(insuredMember.getDateOfBirth());
        this.setAge(insuredMember.getAge());
        this.setHeight(insuredMember.getHeight());
        this.setWeight(insuredMember.getWeight());
        this.setBodyMassIndex(insuredMember.getBodyMassIndex());
        this.setRelationshipWithProposer(insuredMember.getRelationshipWithProposer());
        this.setProfession(insuredMember.getProfession());
        this.setMaritalStatus(insuredMember.getMaritalStatus());
        this.setMonthlyIncome(insuredMember.getMonthlyIncome());
        this.setIdProof(insuredMember.getIdProof());
        this.setIdProofNumber(insuredMember.getIdProofNumber());
        this.setNationality(insuredMember.getNationality());
        this.setRiderRequested(insuredMember.getRiderRequested());
        this.setSumInsured(insuredMember.getSumInsured());
        this.setRiderSumInsured(insuredMember.getRiderSumInsured());
        this.setCountryCode(insuredMember.getCountryCode());
        this.setMobileNumber(insuredMember.getMobileNumber());
        this.setMedicalHistoryQuestion(insuredMember.getMedicalHistoryQuestion());
    }

}
