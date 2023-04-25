package com.health.insurance.medicalhistory.controller;

import com.health.insurance.medicalhistory.exception.RecordExistException;
import com.health.insurance.medicalhistory.exception.RecordNotFoundException;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLifestyle;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreatePersonalMedicalConditions;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import com.health.insurance.medicalhistory.service.MedicalConditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/health-insurance/medical-history")
public class MedicalConditionsController {

    @Autowired
    MedicalConditionsService medicalConditionsService;

    @GetMapping(path = "/{personalMedicalConditionsId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonalMedicalConditions> findPersonalMedicalConditionsRecordById(@PathVariable("personalMedicalConditionsId") final Integer personalMedicalConditionsId) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.findPersonalMedicalConditionsRecordById(personalMedicalConditionsId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-personal-medical-conditions", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonalMedicalConditions> createPersonalMedicalConditionsRecord(@RequestBody final CreatePersonalMedicalConditions request) throws RecordExistException {
        return new ResponseEntity<>(medicalConditionsService.createPersonalMedicalConditionsRecord(request), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{diseaseQuestionnaireId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiseaseQuestionnaire> findDiseaseQuestionnaireRecordById(@PathVariable("diseaseQuestionnaireId") final Integer diseaseQuestionnaireId) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.findDiseaseQuestionnaireRecordById(diseaseQuestionnaireId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-disease-questionnaire", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiseaseQuestionnaire> createDiseaseQuestionnaireRecord(@RequestBody final CreateDiseaseQuestionnaire request) throws RecordExistException {
        return new ResponseEntity<>(medicalConditionsService.createDiseaseQuestionnaireRecord(request), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{lifestyleId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Lifestyle> findLifestyleRecordById(@PathVariable("lifestyleId") final Integer lifestyleId) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.findLifestyleRecordById(lifestyleId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-lifestyle", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Lifestyle> createLifestyleRecord(@RequestBody final CreateLifestyle request) throws RecordExistException {
        return new ResponseEntity<>(medicalConditionsService.createLifestyleRecord(request), HttpStatus.CREATED);
    }
}
