package com.health.insurance.medicalhistory.service;

import com.health.insurance.medicalhistory.exception.ErrorMessageConstant;
import com.health.insurance.medicalhistory.exception.RecordExistException;
import com.health.insurance.medicalhistory.exception.RecordNotFoundException;
import com.health.insurance.medicalhistory.model.utility.builder.DiseaseQuestionnaireBuilder;
import com.health.insurance.medicalhistory.model.utility.builder.LifestyleBuilder;
import com.health.insurance.medicalhistory.model.utility.builder.PersonalMedicalConditionsBuilder;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLifestyle;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreatePersonalMedicalConditions;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import com.health.insurance.medicalhistory.repository.DiseaseQuestionnaireRepository;
import com.health.insurance.medicalhistory.repository.LifestyleRepository;
import com.health.insurance.medicalhistory.repository.PersonalMedicalConditionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalConditionsService {

    PersonalMedicalConditionsRepository personalMedicalConditionsRepository;
    PersonalMedicalConditionsBuilder personalMedicalConditionsBuilder;
    LifestyleRepository lifestyleRepository;
    LifestyleBuilder lifestyleBuilder;

    DiseaseQuestionnaireRepository diseaseQuestionnaireRepository;
    DiseaseQuestionnaireBuilder diseaseQuestionnaireBuilder;

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

}
