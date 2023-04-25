package com.health.insurance.medicalhistory.service;

import com.health.insurance.medicalhistory.exception.ErrorMessageConstant;
import com.health.insurance.medicalhistory.exception.RecordExistException;
import com.health.insurance.medicalhistory.exception.RecordNotFoundException;
import com.health.insurance.medicalhistory.model.builder.MedicalConditionsBuilder;
import com.health.insurance.medicalhistory.model.dto.CreateMedicalConditions;
import com.health.insurance.medicalhistory.model.dto.UpdateMedicalConditions;
import com.health.insurance.medicalhistory.model.entity.MedicalConditions;
import com.health.insurance.medicalhistory.model.utility.builder.DiseaseQuestionnaireBuilder;
import com.health.insurance.medicalhistory.model.utility.builder.LabTestsBuilder;
import com.health.insurance.medicalhistory.model.utility.builder.LifestyleBuilder;
import com.health.insurance.medicalhistory.model.utility.builder.PersonalMedicalConditionsBuilder;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLabTests;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLifestyle;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreatePersonalMedicalConditions;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import com.health.insurance.medicalhistory.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalConditionsService {

    MedicalConditionsRepository medicalConditionsRepository;
    MedicalConditionsBuilder medicalConditionsBuilder;

    PersonalMedicalConditionsRepository personalMedicalConditionsRepository;
    PersonalMedicalConditionsBuilder personalMedicalConditionsBuilder;

    DiseaseQuestionnaireRepository diseaseQuestionnaireRepository;
    DiseaseQuestionnaireBuilder diseaseQuestionnaireBuilder;

    LifestyleRepository lifestyleRepository;
    LifestyleBuilder lifestyleBuilder;

    LabTestsRepository labTestsRepository;
    LabTestsBuilder labTestsBuilder;

    public MedicalConditions findMedicalConditionsById(Integer medicalConditionsId) throws RecordNotFoundException {

        return medicalConditionsRepository.findById(medicalConditionsId).orElseThrow(
                () -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT)
        );

    }

    public MedicalConditions createMedicalConditionsRecord(CreateMedicalConditions request) throws RecordExistException {

        List<MedicalConditions> medicalConditionsList = medicalConditionsRepository.findMedicalConditionsListById(request.getMedicalConditionsId());

        try {
            if (medicalConditionsList.isEmpty()) {
                return medicalConditionsRepository.save(medicalConditionsBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;

    }

    public MedicalConditions updateMedicalConditionsRecord(Integer medicalConditionsId, UpdateMedicalConditions request) throws RecordNotFoundException {

        MedicalConditions medicalConditionsToUpdate = medicalConditionsRepository.findMedicalConditionsById(medicalConditionsId);

        try {
            if (null == medicalConditionsToUpdate) {
                throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
            } else {
                return medicalConditionsRepository.save(medicalConditionsBuilder.updateFromRequest(medicalConditionsToUpdate, request));
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
        }

    }

    public void deleteMedicalConditionsById(Integer medicalConditionsId) throws RecordNotFoundException {

        Optional<MedicalConditions> medicalConditions = medicalConditionsRepository.findById(medicalConditionsId);

        try {
            if (medicalConditions.isPresent()) {
                medicalConditionsRepository.deleteById(medicalConditionsId);
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT);
        }

    }

    public PersonalMedicalConditions findPersonalMedicalConditionsRecordById(Integer personalMedicalConditionsId) throws RecordNotFoundException {

        return personalMedicalConditionsRepository.findById(personalMedicalConditionsId).orElseThrow(
                () -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT)
        );

    }

    public PersonalMedicalConditions createPersonalMedicalConditionsRecord(CreatePersonalMedicalConditions request) throws RecordExistException {

        List<PersonalMedicalConditions> personalMedicalConditionsList = personalMedicalConditionsRepository.findPersonalMedicalConditionsListById(request.getPersonalMedicalConditionsId());

        try {
            if (personalMedicalConditionsList.isEmpty()) {
                return personalMedicalConditionsRepository.save(personalMedicalConditionsBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;

    }

    public DiseaseQuestionnaire findDiseaseQuestionnaireRecordById(Integer diseaseQuestionnaireId) throws RecordNotFoundException {

        return diseaseQuestionnaireRepository.findById(diseaseQuestionnaireId).orElseThrow(
                () -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT)
        );
    }

    public DiseaseQuestionnaire createDiseaseQuestionnaireRecord(CreateDiseaseQuestionnaire request) throws RecordExistException {

        List<DiseaseQuestionnaire> diseaseQuestionnaireList = diseaseQuestionnaireRepository.findDiseaseQuestionnaireListById(request.getDiseaseQuestionnaireId());

        try {
            if (diseaseQuestionnaireList.isEmpty()) {
                return diseaseQuestionnaireRepository.save(diseaseQuestionnaireBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;
    }

    public Lifestyle findLifestyleRecordById(Integer lifestyleId) throws RecordNotFoundException {

        return lifestyleRepository.findById(lifestyleId).orElseThrow(() -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT));

    }

    public Lifestyle createLifestyleRecord(CreateLifestyle request) throws RecordExistException {

        List<Lifestyle> lifestyleList = lifestyleRepository.findLifestyleListById(request.getLifestyleId());

        try {
            if (lifestyleList.isEmpty()) {
                return lifestyleRepository.save(lifestyleBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;

    }

    public LabTests findLabTestsById(Integer labTestsId) throws RecordNotFoundException {

        return labTestsRepository.findById(labTestsId).orElseThrow(() -> new RecordNotFoundException(ErrorMessageConstant.DATA_NOT_PRESENT));

    }

    public LabTests createLabTestsRecord(CreateLabTests request) throws RecordExistException {

        List<LabTests> labTestsList = labTestsRepository.findLabTestsListById(request.getLabTestsId());

        try {
            if (labTestsList.isEmpty()) {
                return labTestsRepository.save(labTestsBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException(ErrorMessageConstant.DATA_ALREADY_PRESENT);
        }

        return null;

    }

}
