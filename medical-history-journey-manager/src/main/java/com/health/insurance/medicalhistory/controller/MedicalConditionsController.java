package com.health.insurance.medicalhistory.controller;

import com.health.insurance.medicalhistory.exception.RecordExistException;
import com.health.insurance.medicalhistory.exception.RecordNotFoundException;
import com.health.insurance.medicalhistory.model.dto.CreateMedicalConditions;
import com.health.insurance.medicalhistory.model.dto.UpdateMedicalConditions;
import com.health.insurance.medicalhistory.model.entity.MedicalConditions;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateDiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLabTests;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLifestyle;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreatePersonalMedicalConditions;
import com.health.insurance.medicalhistory.model.utility.entity.DiseaseQuestionnaire;
import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.PersonalMedicalConditions;
import com.health.insurance.medicalhistory.service.MedicalConditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/health-insurance/medical-history/medical-conditions")
public class MedicalConditionsController {

    @Autowired
    MedicalConditionsService medicalConditionsService;

    @GetMapping(path = "/{medicalConditionsId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MedicalConditions> findMedicalConditionsById(@PathVariable("medicalConditionsId") final Integer medicalConditionsId) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.findMedicalConditionsById(medicalConditionsId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-medical-conditions", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MedicalConditions> createMedicalConditionsRecord(@RequestBody final CreateMedicalConditions request) throws RecordExistException {
        return new ResponseEntity<>(medicalConditionsService.createMedicalConditionsRecord(request), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{medicalConditionsId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MedicalConditions> updateMedicalConditionsRecord(@PathVariable("medicalConditionsId") final Integer medicalConditionsId, @RequestBody final UpdateMedicalConditions request) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.updateMedicalConditionsRecord(medicalConditionsId, request), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{medicalConditionsId}")
    public ResponseEntity<Boolean> deleteMedicalConditionsById(@PathVariable("medicalConditionsId") final Integer medicalConditionsId) throws RecordNotFoundException {
        medicalConditionsService.deleteMedicalConditionsById(medicalConditionsId);
        return ResponseEntity.ok(true);
    }

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

    @GetMapping(path = "/{labTestsId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LabTests> findLabTestsById(@PathVariable("labTestsId") final Integer labTestsId) throws RecordNotFoundException {
        return new ResponseEntity<>(medicalConditionsService.findLabTestsById(labTestsId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-labTests", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LabTests> createLabTestsRecord(@RequestBody final CreateLabTests request) throws RecordExistException {
        return new ResponseEntity<>(medicalConditionsService.createLabTestsRecord(request), HttpStatus.CREATED);
    }

}
