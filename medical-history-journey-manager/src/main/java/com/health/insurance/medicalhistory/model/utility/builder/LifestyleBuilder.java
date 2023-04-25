package com.health.insurance.medicalhistory.model.utility.builder;

import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLifestyle;
import com.health.insurance.medicalhistory.model.utility.entity.Lifestyle;
import org.springframework.stereotype.Component;

@Component
public class LifestyleBuilder {

    public Lifestyle buildFromRequest(CreateLifestyle request) {

        Lifestyle lifestyle = new Lifestyle();

        lifestyle.setLifestyleId(request.getLifestyleId());
        lifestyle.setTobaccoOrAlcoholConsumption(request.getTobaccoOrAlcoholConsumption());
        lifestyle.setAlcoholConsumptionPerDay(request.getAlcoholConsumptionPerDay());
        lifestyle.setPanMasalaConsumptionPerDay(request.getPanMasalaConsumptionPerDay());
        lifestyle.setSmokingConsumptionPerDay(request.getSmokingConsumptionPerDay());
        lifestyle.setTotalYearsOfSmoking(request.getTotalYearsOfSmoking());

        return lifestyle;
    }

}
