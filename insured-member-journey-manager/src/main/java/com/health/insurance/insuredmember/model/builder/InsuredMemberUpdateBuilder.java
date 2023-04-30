package com.health.insurance.insuredmember.model.builder;

import com.health.insurance.insuredmember.model.dto.UpdateInsuredMember;
import com.health.insurance.insuredmember.model.entity.InsuredMember;
import org.springframework.stereotype.Component;

@Component
public class InsuredMemberUpdateBuilder {

    public void updateInsuredMemberForm1(InsuredMember insuredMemberAfterUpdate, UpdateInsuredMember request) {

        if (null != request.getFirstName()) {
            insuredMemberAfterUpdate.setFirstName(request.getFirstName());
        }
        if (null != request.getMiddleName()) {
            insuredMemberAfterUpdate.setMiddleName(request.getMiddleName());
        }
        if (null != request.getLastName()) {
            insuredMemberAfterUpdate.setLastName(request.getLastName());
        }
        if (null != request.getGender()) {
            insuredMemberAfterUpdate.setGender(request.getGender());
        }
        if (null != request.getDateOfBirth()) {
            insuredMemberAfterUpdate.setDateOfBirth(request.getDateOfBirth());
        }
        if (null != request.getAge()) {
            insuredMemberAfterUpdate.setAge(request.getAge());
        }
        if (null != request.getHeight()) {
            insuredMemberAfterUpdate.setHeight(request.getHeight());
        }
        if (null != request.getWeight()) {
            insuredMemberAfterUpdate.setWeight(request.getWeight());
        }
        if (null != request.getBodyMassIndex()) {
            insuredMemberAfterUpdate.setBodyMassIndex(request.getBodyMassIndex());
        }
        if (null != request.getRelationshipWithProposer()) {
            insuredMemberAfterUpdate.setRelationshipWithProposer(request.getRelationshipWithProposer());
        }
        if (null != request.getProfession()) {
            insuredMemberAfterUpdate.setProfession(request.getProfession());
        }

    }

    public void updateInsuredMemberForm2(InsuredMember insuredMemberAfterUpdate, UpdateInsuredMember request) {

        if (null != request.getMaritalStatus()) {
            insuredMemberAfterUpdate.setMaritalStatus(request.getMaritalStatus());
        }
        if (null != request.getMonthlyIncome()) {
            insuredMemberAfterUpdate.setMonthlyIncome(request.getMonthlyIncome());
        }
        if (null != request.getIdProof()) {
            insuredMemberAfterUpdate.setIdProof(request.getIdProof());
        }
        if (null != request.getIdProofNumber()) {
            insuredMemberAfterUpdate.setIdProofNumber(request.getIdProofNumber());
        }
        if (null != request.getNationality()) {
            insuredMemberAfterUpdate.setNationality(request.getNationality());
        }
        if (null != request.getRiderRequested()) {
            insuredMemberAfterUpdate.setRiderRequested(request.getRiderRequested());
        }
        if (null != request.getSumInsured()) {
            insuredMemberAfterUpdate.setSumInsured(request.getSumInsured());
        }
        if (null != request.getRiderSumInsured()) {
            insuredMemberAfterUpdate.setRiderSumInsured(request.getRiderSumInsured());
        }
        if (null != request.getCountryCode()) {
            insuredMemberAfterUpdate.setCountryCode(request.getCountryCode());
        }
        if (null != request.getMobileNumber()) {
            insuredMemberAfterUpdate.setMobileNumber(request.getMobileNumber());
        }
        if (Boolean.TRUE.equals(request.getMedicalHistoryQuestion())) {
            insuredMemberAfterUpdate.setMedicalHistoryQuestion(request.getMedicalHistoryQuestion());
        }

    }

}
