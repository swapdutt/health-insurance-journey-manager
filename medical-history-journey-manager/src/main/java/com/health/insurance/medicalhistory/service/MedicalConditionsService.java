package com.health.insurance.medicalhistory.service;

import com.health.insurance.medicalhistory.exception.RecordExistException;
import com.health.insurance.medicalhistory.exception.RecordNotFoundException;
import com.health.insurance.medicalhistory.model.utility.builder.DiseaseQuestionnaireBuilder;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.update.UpdateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import com.health.insurance.medicalhistory.repository.DiseaseQuestionnaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalConditionsService {

    DiseaseQuestionnaireRepository diseaseQuestionnaireRepository;

    DiseaseQuestionnaireBuilder diseaseQuestionnaireBuilder;

    public DiseaseQuestionnaire findDiseaseQuestionnaireRecordById(Integer diseaseQuestionnaireId) throws RecordNotFoundException {

        return diseaseQuestionnaireRepository.findById(diseaseQuestionnaireId).orElseThrow(
                () -> new RecordNotFoundException("The requested data is not present!!!")
        );
    }

    public DiseaseQuestionnaire createDiseaseQuestionnaireRecord(CreateDiseaseQuestionnaire request) throws RecordExistException {

        List<DiseaseQuestionnaire> diseaseQuestionnaireList = diseaseQuestionnaireRepository.findDiseaseQuestionnaireListById(request.getDiseaseQuestionnaireId());

        try {
            if (null != diseaseQuestionnaireList) {
                return diseaseQuestionnaireRepository.save(diseaseQuestionnaireBuilder.buildFromRequest(request));
            }
        } catch (RecordExistException e) {
            throw new RecordExistException("The requested data already exists!!!");
        }

        return null;
    }

    public DiseaseQuestionnaire updateDiseaseQuestionnaireRecord(Integer diseaseQuestionnaireId, UpdateDiseaseQuestionnaire request) throws RecordNotFoundException {

        DiseaseQuestionnaire diseaseQuestionnaireToUpdate = diseaseQuestionnaireRepository.findDiseaseQuestionnaireById(diseaseQuestionnaireId);

        try {
            if (!diseaseQuestionnaireId.equals(diseaseQuestionnaireToUpdate.getDiseaseQuestionnaireId())) {
                throw new RecordNotFoundException("The requested data is not present!!!");
            } else {
                return diseaseQuestionnaireRepository.save(diseaseQuestionnaireBuilder.updateFromRequest(diseaseQuestionnaireToUpdate, request));
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException("The requested data is not present!!!");
        }

    }

    public void deleteDiseaseQuestionnaireRecordById(Integer diseaseQuestionnaireId) throws RecordNotFoundException {

        Optional<DiseaseQuestionnaire> diseaseQuestionnaire = diseaseQuestionnaireRepository.findById(diseaseQuestionnaireId);

        try {
            if (diseaseQuestionnaire.isPresent()) {
                diseaseQuestionnaireRepository.deleteById(diseaseQuestionnaireId);
            }
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException("The requested data is not present!!!");
        }

    }

}
