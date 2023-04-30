package com.health.insurance.insuredmember.model.builder;

import com.health.insurance.insuredmember.exception.InvalidRequestException;
import com.health.insurance.insuredmember.model.dto.CreateInsuredMember;
import com.health.insurance.insuredmember.model.dto.UpdateInsuredMember;
import com.health.insurance.insuredmember.model.entity.InsuredMember;
import org.springframework.stereotype.Component;

@Component
public class InsuredMemberBuilder {

    public InsuredMember buildFromRequest(CreateInsuredMember request) {

        InsuredMember insuredMember = new InsuredMember();

        insuredMember.setMemberId(request.getMemberId());
        insuredMember.setFirstName(request.getFirstName());
        insuredMember.setMiddleName(request.getMiddleName());
        insuredMember.setLastName(request.getLastName());
        insuredMember.setGender(request.getGender());
        insuredMember.setDateOfBirth(request.getDateOfBirth());
        insuredMember.setAge(request.getAge());
        insuredMember.setHeight(request.getHeight());
        insuredMember.setWeight(request.getWeight());
        insuredMember.setBodyMassIndex(request.getBodyMassIndex());
        insuredMember.setRelationshipWithProposer(request.getRelationshipWithProposer());
        insuredMember.setProfession(request.getProfession());
        insuredMember.setMaritalStatus(request.getMaritalStatus());
        insuredMember.setMonthlyIncome(request.getMonthlyIncome());
        insuredMember.setIdProof(request.getIdProof());
        insuredMember.setIdProofNumber(request.getIdProofNumber());
        insuredMember.setNationality(request.getNationality());
        insuredMember.setRiderRequested(request.getRiderRequested());
        insuredMember.setSumInsured(request.getSumInsured());
        insuredMember.setRiderSumInsured(request.getRiderSumInsured());
        insuredMember.setCountryCode(request.getCountryCode());
        insuredMember.setMobileNumber(request.getMobileNumber());
        insuredMember.setMedicalHistoryQuestion(request.getMedicalHistoryQuestion());

        return insuredMember;

    }

    public InsuredMember updateFromRequest(InsuredMember insuredMemberToUpdate, UpdateInsuredMember request) {

        InsuredMember insuredMemberAfterUpdate = new InsuredMember(insuredMemberToUpdate);

        try {

            InsuredMemberUpdateBuilder insuredMemberUpdateBuilder = new InsuredMemberUpdateBuilder();
            insuredMemberUpdateBuilder.updateInsuredMemberForm1(insuredMemberToUpdate, request);
            insuredMemberUpdateBuilder.updateInsuredMemberForm2(insuredMemberToUpdate, request);

            return insuredMemberAfterUpdate;

        } catch (InvalidRequestException e) {
            throw new InvalidRequestException("The data set required to update the entity is empty or not in proper format");
        }

    }

}
