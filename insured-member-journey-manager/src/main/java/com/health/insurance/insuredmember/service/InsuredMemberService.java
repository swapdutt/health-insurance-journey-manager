package com.health.insurance.insuredmember.service;

import com.health.insurance.insuredmember.exception.ErrorMessageConstant;
import com.health.insurance.insuredmember.exception.RecordExistException;
import com.health.insurance.insuredmember.exception.RecordNotFoundException;
import com.health.insurance.insuredmember.model.builder.InsuredMemberBuilder;
import com.health.insurance.insuredmember.model.dto.CreateInsuredMember;
import com.health.insurance.insuredmember.model.dto.UpdateInsuredMember;
import com.health.insurance.insuredmember.model.entity.InsuredMember;
import com.health.insurance.insuredmember.repository.InsuredMemberRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class InsuredMemberService {

    InsuredMemberRepository insuredMemberRepository;

    InsuredMemberBuilder insuredMemberBuilder;

    public List<InsuredMember> findAllInsuredMembers() throws RecordNotFoundException {

        try {
            if (!insuredMemberRepository.findAll().isEmpty()) {
                return insuredMemberRepository.findAll();
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
        }

        return Collections.emptyList();

    }

    public InsuredMember findInsuredMemberById(Integer insuredMemberId) throws RecordNotFoundException {

        return insuredMemberRepository.findById(insuredMemberId).orElseThrow(() -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT));

    }

    public InsuredMember createInsuredMemberRecord(CreateInsuredMember request) throws RecordExistException {

        try {

            if (insuredMemberRepository.findInsuredMemberListById(request.getMemberId()).isEmpty()) {
                return insuredMemberRepository.save(insuredMemberBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;

    }

    public InsuredMember updateInsuredMemberRecord(Integer insuredMemberId, UpdateInsuredMember request) throws RecordNotFoundException {

        InsuredMember insuredMemberToUpdate = insuredMemberRepository.findInsuredMemberById(insuredMemberId);

        try {
            if (null == insuredMemberToUpdate) {
                throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
            } else {
                return insuredMemberRepository.save(insuredMemberBuilder.updateFromRequest(insuredMemberToUpdate, request));
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
        }

    }

    public void deleteInsuredMemberById(Integer insuredMemberId) throws RecordNotFoundException {

        Optional<InsuredMember> insuredMember = insuredMemberRepository.findById(insuredMemberId);

        try {
            if (insuredMember.isPresent()) {
                insuredMemberRepository.deleteById(insuredMemberId);
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
        }
    }

}
