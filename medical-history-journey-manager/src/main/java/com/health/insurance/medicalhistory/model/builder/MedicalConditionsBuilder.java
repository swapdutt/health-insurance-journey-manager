package com.health.insurance.medicalhistory.model.builder;

import com.health.insurance.medicalhistory.exception.InvalidRequestException;
import com.health.insurance.medicalhistory.model.dto.CreateMedicalConditions;
import com.health.insurance.medicalhistory.model.dto.UpdateMedicalConditions;
import com.health.insurance.medicalhistory.model.entity.MedicalConditions;
import org.springframework.stereotype.Component;

@Component
public class MedicalConditionsBuilder {

    public MedicalConditions buildFromRequest(CreateMedicalConditions request) {

        MedicalConditions medicalConditions = new MedicalConditions();

        medicalConditions.setMedicalConditionsId(request.getMedicalConditionsId());
        medicalConditions.setPersonalMedicalConditionsIndicator(request.getPersonalMedicalConditionsIndicator());
        medicalConditions.setPersonalMedicalConditionsList(request.getPersonalMedicalConditionsList());
        medicalConditions.setLabTestsIndicator(request.getLabTestsIndicator());
        medicalConditions.setLabTests(request.getLabTests());
        medicalConditions.setLifestyleIndicator(request.getLifestyleIndicator());
        medicalConditions.setLifestyle(request.getLifestyle());

        return medicalConditions;

    }

    public MedicalConditions updateFromRequest(MedicalConditions medicalConditionsToBeUpdated, UpdateMedicalConditions request) {

        MedicalConditions medicalConditionsAfterUpdate = new MedicalConditions(medicalConditionsToBeUpdated);

        try {
            if (Boolean.TRUE.equals(request.getPersonalMedicalConditionsIndicator())) {
                medicalConditionsAfterUpdate.setPersonalMedicalConditionsIndicator(request.getPersonalMedicalConditionsIndicator());
            }
            if (Boolean.TRUE.equals(request.getPersonalMedicalConditionsIndicator()) && !request.getPersonalMedicalConditionsList().isEmpty()) {
                medicalConditionsAfterUpdate.setPersonalMedicalConditionsList(request.getPersonalMedicalConditionsList());
            }
            if (Boolean.TRUE.equals(request.getLabTestsIndicator())) {
                medicalConditionsAfterUpdate.setLabTestsIndicator(request.getLabTestsIndicator());
            }
            if (Boolean.TRUE.equals(request.getLabTestsIndicator()) && null != request.getLabTests()) {
                medicalConditionsAfterUpdate.setLabTests(request.getLabTests());
            }
            if (Boolean.TRUE.equals(request.getLifestyleIndicator())) {
                medicalConditionsAfterUpdate.setLifestyleIndicator(request.getLifestyleIndicator());
            }
            if (Boolean.TRUE.equals(request.getLifestyleIndicator()) && null != request.getLifestyle()) {
                medicalConditionsAfterUpdate.setLifestyle(request.getLifestyle());
            }
        } catch (InvalidRequestException e) {
            throw new InvalidRequestException("The data set required to update the entity is empty or not in proper format");
        }

        return medicalConditionsAfterUpdate;

    }

}
