package com.health.insurance.medicalhistory.model.utility.builder;

import com.health.insurance.medicalhistory.exception.InvalidRequestException;
import com.health.insurance.medicalhistory.model.utility.dto.create.CreateLabTests;
import com.health.insurance.medicalhistory.model.utility.dto.update.UpdateLabTests;
import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import org.springframework.stereotype.Component;

@Component
public class LabTestsBuilder {

    public LabTests buildFromRequest(CreateLabTests request) {

        LabTests labTests = new LabTests();

        labTests.setLabTestsId(request.getLabTestsId());
        labTests.setSugarInUrine(request.getSugarInUrine());
        labTests.setBilirubinInUrine(request.getBilirubinInUrine());
        labTests.setKetonesInUrine(request.getKetonesInUrine());
        labTests.setProteinInUrine(request.getProteinInUrine());
        labTests.setRbcBloodCountInUrine(request.getRbcBloodCountInUrine());
        labTests.setResultOfTMT(request.getResultOfTMT());
        labTests.setResultOfDobutamineStressECHO(request.getResultOfDobutamineStressECHO());
        labTests.setResultOfStressThallium(request.getResultOfStressThallium());
        labTests.setResultOfCTFindings(request.getResultOfCTFindings());
        labTests.setResultOfChestXRay(request.getResultOfChestXRay());
        labTests.setResultOfEcho(request.getResultOfEcho());
        labTests.setResultOfECG(request.getResultOfECG());
        labTests.setResultOfUSGAbdomen(request.getResultOfUSGAbdomen());
        labTests.setOtherMedicalReports(request.getOtherMedicalReports());
        labTests.setCrystalsInUrine(request.getCrystalsInUrine());
        labTests.setRbcWBCCastsInUrine(request.getRbcWBCCastsInUrine());
        labTests.setGranularWaxyCasts(request.getGranularWaxyCasts());
        labTests.setWbcPlusCellsInUrine(request.getWbcPlusCellsInUrine());
        labTests.setRbcPerHPF(request.getRbcPerHPF());
        labTests.setCountOfRBC(request.getCountOfRBC());
        labTests.setUpperCountOfRBC(request.getUpperCountOfRBC());
        labTests.setLowerCountOfRBC(request.getLowerCountOfRBC());
        labTests.setPcvHematocrit(request.getPcvHematocrit());
        labTests.setUpperCountOfPCVHematocrit(request.getUpperCountOfPCVHematocrit());
        labTests.setLowerCountOfPCVHematocrit(request.getLowerCountOfPCVHematocrit());
        labTests.setCountOfMCV(request.getCountOfMCV());
        labTests.setUpperCountOfMCV(request.getUpperCountOfMCV());
        labTests.setLowerCountOfMCV(request.getLowerCountOfMCV());
        labTests.setCountOfMCH(request.getCountOfMCH());
        labTests.setUpperCountOfMCH(request.getUpperCountOfMCH());
        labTests.setLowerCountOfMCH(request.getLowerCountOfMCH());
        labTests.setCountOfMCHC(request.getCountOfMCHC());
        labTests.setUpperCountOfMCHC(request.getUpperCountOfMCHC());
        labTests.setLowerCountOfMCHC(request.getLowerCountOfMCHC());
        labTests.setValueOfTSH(request.getValueOfTSH());
        labTests.setUpperValueOfTSH(request.getUpperValueOfTSH());
        labTests.setLowerValueOfTSH(request.getLowerValueOfTSH());
        labTests.setValueOfTLC(request.getValueOfTLC());
        labTests.setUpperValueOfTLC(request.getUpperValueOfTLC());
        labTests.setLowerValueOfTLC(request.getLowerValueOfTLC());
        labTests.setValueOfNeutrophil(request.getValueOfNeutrophil());
        labTests.setUpperValueOfNeutrophil(request.getUpperValueOfNeutrophil());
        labTests.setLowerValueOfNeutrophil(request.getLowerValueOfNeutrophil());
        labTests.setValueOfEsoinophil(request.getValueOfEsoinophil());
        labTests.setUpperValueOfEsoinophil(request.getUpperValueOfEsoinophil());
        labTests.setLowerValueOfEsoinophil(request.getLowerValueOfEsoinophil());
        labTests.setValueOfBasophil(request.getValueOfBasophil());
        labTests.setUpperValueOfBasophil(request.getUpperValueOfBasophil());
        labTests.setLowerValueOfEsoinophil(request.getLowerValueOfEsoinophil());
        labTests.setValueOfMonocyte(request.getValueOfMonocyte());
        labTests.setUpperValueOfMonocyte(request.getUpperValueOfMonocyte());
        labTests.setLowerValueOfMonocyte(request.getLowerValueOfMonocyte());
        labTests.setValueOfLymphocyte(request.getValueOfLymphocyte());
        labTests.setUpperValueOfLymphocyte(request.getUpperValueOfLymphocyte());
        labTests.setLowerValueOfLymphocyte(request.getLowerValueOfLymphocyte());
        labTests.setCountOfPlatelet(request.getCountOfPlatelet());
        labTests.setUpperCountOfPlatelet(request.getUpperCountOfPlatelet());
        labTests.setLowerCountOfPlatelet(request.getLowerCountOfPlatelet());
        labTests.setValueOfESR(request.getValueOfESR());
        labTests.setUpperValueOfESR(request.getUpperValueOfESR());
        labTests.setLowerValueOfESR(request.getLowerValueOfESR());
        labTests.setValueOfFBS(request.getValueOfFBS());
        labTests.setUpperValueOfFBS(request.getUpperValueOfFBS());
        labTests.setLowerValueOfFBS(request.getLowerValueOfFBS());
        labTests.setValueOfHbA1C(request.getValueOfHbA1C());
        labTests.setUpperValueOfHbA1C(request.getUpperValueOfHbA1C());
        labTests.setLowerValueOfHbA1C(request.getLowerValueOfHbA1C());
        labTests.setValueOfSerumCreatinineRFT(request.getValueOfSerumCreatinineRFT());
        labTests.setUpperValueOfSerumCreatinineRFT(request.getUpperValueOfSerumCreatinineRFT());
        labTests.setLowerValueOfSerumCreatinineRFT(request.getLowerValueOfSerumCreatinineRFT());
        labTests.setAmountOfUricAcid(request.getAmountOfUricAcid());
        labTests.setUpperAmountOfUricAcid(request.getUpperAmountOfUricAcid());
        labTests.setLowerAmountOfUricAcid(request.getLowerAmountOfUricAcid());
        labTests.setValueOfSGOTAST(request.getValueOfSGOTAST());
        labTests.setUpperValueOfSGOTAST(request.getUpperValueOfSGOTAST());
        labTests.setLowerValueOfSGOTAST(request.getLowerValueOfSGOTAST());
        labTests.setValueOfSGPTALT(request.getValueOfSGPTALT());
        labTests.setUpperValueOfSGPTALT(request.getUpperValueOfSGPTALT());
        labTests.setLowerValueOfSGPTALT(request.getLowerValueOfSGPTALT());
        labTests.setRatioBetweenSGOTAndSGPT(request.getRatioBetweenSGOTAndSGPT());
        labTests.setValueOfBUN(request.getValueOfBUN());
        labTests.setUpperValueOfBUN(request.getUpperValueOfBUN());
        labTests.setLowerValueOfBUN(request.getLowerValueOfBUN());
        labTests.setValueOfNA(request.getValueOfNA());
        labTests.setUpperValueOfNA(request.getUpperValueOfNA());
        labTests.setLowerValueOfNA(request.getLowerValueOfNA());
        labTests.setValueOfK(request.getValueOfK());
        labTests.setUpperValueOfK(request.getUpperValueOfK());
        labTests.setLowerValueOfK(request.getLowerValueOfK());
        labTests.setValueOfCA(request.getValueOfCA());
        labTests.setUpperValueOfCA(request.getUpperValueOfCA());
        labTests.setLowerValueOfCA(request.getLowerValueOfCA());
        labTests.setValueOfPO4(request.getValueOfPO4());
        labTests.setUpperValueOfPO4(request.getUpperValueOfPO4());
        labTests.setLowerValueOfPO4(request.getLowerValueOfPO4());
        labTests.setValueOfCI(request.getValueOfCI());
        labTests.setUpperValueOfCI(request.getUpperValueOfCI());
        labTests.setValueOfHCO3(request.getValueOfHCO3());
        labTests.setUpperValueOfHCO3(request.getUpperValueOfHCO3());
        labTests.setLowerValueOfHCO3(request.getLowerValueOfHCO3());
        labTests.setValueOfGGT(request.getValueOfGGT());
        labTests.setUpperValueOfGGT(request.getUpperValueOfGGT());
        labTests.setLowerValueOfGGT(request.getLowerValueOfGGT());
        labTests.setValueOfALP(request.getValueOfALP());
        labTests.setUpperValueOfALP(request.getUpperValueOfALP());
        labTests.setLowerValueOfALP(request.getLowerValueOfALP());
        labTests.setValueOfTotalBilirubin(request.getValueOfTotalBilirubin());
        labTests.setUpperValueOfTotalBilirubin(request.getUpperValueOfTotalBilirubin());
        labTests.setLowerValueOfTotalBilirubin(request.getLowerValueOfTotalBilirubin());
        labTests.setValueOfSerumAlbumin(request.getValueOfSerumAlbumin());
        labTests.setUpperValueOfSerumAlbumin(request.getUpperValueOfSerumAlbumin());
        labTests.setLowerValueOfSerumAlbumin(request.getLowerValueOfSerumAlbumin());
        labTests.setValueOfUrineMicroAlbumin(request.getValueOfUrineMicroAlbumin());
        labTests.setUpperValueOfUrineMicroAlbumin(request.getUpperValueOfUrineMicroAlbumin());
        labTests.setLowerValueOfUrineMicroAlbumin(request.getLowerValueOfUrineMicroAlbumin());
        labTests.setValueOfTotalProtein(request.getValueOfTotalProtein());
        labTests.setUpperValueOfTotalProtein(request.getUpperValueOfTotalProtein());
        labTests.setLowerValueOfTotalProtein(request.getLowerValueOfTotalProtein());
        labTests.setValueOfPSA(request.getValueOfPSA());
        labTests.setUpperValueOfPSA(request.getUpperValueOfPSA());
        labTests.setLowerValueOfPSA(request.getLowerValueOfPSA());
        labTests.setValueOfTC(request.getValueOfTC());
        labTests.setUpperValueOfTC(request.getUpperValueOfTC());
        labTests.setLowerValueOfTC(request.getLowerValueOfTC());
        labTests.setValueOfLDL(request.getValueOfLDL());
        labTests.setUpperValueOfLDL(request.getUpperValueOfLDL());
        labTests.setLowerValueOfLDL(request.getLowerValueOfLDL());
        labTests.setHeartRate(request.getHeartRate());
        labTests.setValueOfHDL(request.getValueOfHDL());
        labTests.setValueOfHB(request.getValueOfHB());
        labTests.setPercentageOfLVEF(request.getPercentageOfLVEF());

        return labTests;
    }

    public LabTests updateFromRequest(LabTests labTestsToBeUpdated, UpdateLabTests request) {

        LabTests labTestsAfterUpdate = new LabTests(labTestsToBeUpdated);

        try {

            LabTestsUpdateBuilder labTestsUpdateBuilder = new LabTestsUpdateBuilder();
            labTestsUpdateBuilder.updateLabTestsForm1(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm2(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm3(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm4(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm5(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm6(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm7(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm8(labTestsAfterUpdate, request);
            labTestsUpdateBuilder.updateLabTestsForm9(labTestsAfterUpdate, request);

            return labTestsAfterUpdate;

        } catch (InvalidRequestException e) {
            throw new InvalidRequestException("The data set required to update the entity is empty or not in proper format");
        }
    }
}
