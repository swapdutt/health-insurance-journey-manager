package com.health.insurance.medicalhistory.model.utility.builder;

import com.health.insurance.medicalhistory.model.utility.dto.update.UpdateLabTests;
import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import org.springframework.stereotype.Component;

@Component
public class LabTestsUpdateBuilder {

    public void updateLabTestsForm1(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getSugarInUrine()) {
            labTestsAfterUpdate.setSugarInUrine(request.getSugarInUrine());
        }
        if (null != request.getBilirubinInUrine()) {
            labTestsAfterUpdate.setBilirubinInUrine(request.getBilirubinInUrine());
        }
        if (null != request.getKetonesInUrine()) {
            labTestsAfterUpdate.setKetonesInUrine(request.getKetonesInUrine());
        }
        if (null != request.getProteinInUrine()) {
            labTestsAfterUpdate.setProteinInUrine(request.getProteinInUrine());
        }
        if (null != request.getRbcBloodCountInUrine()) {
            labTestsAfterUpdate.setRbcBloodCountInUrine(request.getRbcBloodCountInUrine());
        }
        if (null != request.getResultOfTMT()) {
            labTestsAfterUpdate.setResultOfTMT(request.getResultOfTMT());
        }
        if (null != request.getResultOfDobutamineStressECHO()) {
            labTestsAfterUpdate.setResultOfDobutamineStressECHO(request.getResultOfDobutamineStressECHO());
        }
        if (null != request.getResultOfStressThallium()) {
            labTestsAfterUpdate.setResultOfStressThallium(request.getResultOfStressThallium());
        }
        if (null != request.getResultOfCTFindings()) {
            labTestsAfterUpdate.setResultOfCTFindings(request.getResultOfCTFindings());
        }
        if (null != request.getResultOfChestXRay()) {
            labTestsAfterUpdate.setResultOfChestXRay(request.getResultOfChestXRay());
        }
        if (null != request.getResultOfEcho()) {
            labTestsAfterUpdate.setResultOfEcho(request.getResultOfEcho());
        }
        if (null != request.getResultOfECG()) {
            labTestsAfterUpdate.setResultOfECG(request.getResultOfECG());
        }
        if (null != request.getResultOfUSGAbdomen()) {
            labTestsAfterUpdate.setResultOfECG(request.getResultOfECG());
        }
        if (null != request.getOtherMedicalReports()) {
            labTestsAfterUpdate.setOtherMedicalReports(request.getOtherMedicalReports());
        }
        if (null != request.getCrystalsInUrine()) {
            labTestsAfterUpdate.setCrystalsInUrine(request.getCrystalsInUrine());
        }

    }

    public void updateLabTestsForm2(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getRbcWBCCastsInUrine()) {
            labTestsAfterUpdate.setRbcWBCCastsInUrine(request.getRbcWBCCastsInUrine());
        }
        if (null != request.getGranularWaxyCasts()) {
            labTestsAfterUpdate.setGranularWaxyCasts(request.getGranularWaxyCasts());
        }
        if (null != request.getWbcPlusCellsInUrine()) {
            labTestsAfterUpdate.setWbcPlusCellsInUrine(request.getWbcPlusCellsInUrine());
        }
        if (null != request.getRbcPerHPF()) {
            labTestsAfterUpdate.setRbcPerHPF(request.getRbcPerHPF());
        }
        if (null != request.getCountOfRBC()) {
            labTestsAfterUpdate.setCountOfRBC(request.getCountOfRBC());
        }
        if (null != request.getUpperCountOfRBC()) {
            labTestsAfterUpdate.setUpperCountOfRBC(request.getUpperCountOfRBC());
        }
        if (null != request.getLowerCountOfRBC()) {
            labTestsAfterUpdate.setLowerCountOfRBC(request.getLowerCountOfRBC());
        }
        if (null != request.getPcvHematocrit()) {
            labTestsAfterUpdate.setPcvHematocrit(request.getPcvHematocrit());
        }
        if (null != request.getUpperCountOfPCVHematocrit()) {
            labTestsAfterUpdate.setUpperCountOfPCVHematocrit(request.getUpperCountOfPCVHematocrit());
        }
        if (null != request.getLowerCountOfPCVHematocrit()) {
            labTestsAfterUpdate.setLowerCountOfPCVHematocrit(request.getLowerCountOfPCVHematocrit());
        }
        if (null != request.getCountOfMCV()) {
            labTestsAfterUpdate.setCountOfMCV(request.getCountOfMCV());
        }
        if (null != request.getUpperCountOfMCV()) {
            labTestsAfterUpdate.setUpperCountOfMCV(request.getUpperCountOfMCV());
        }
        if (null != request.getLowerCountOfMCV()) {
            labTestsAfterUpdate.setLowerCountOfMCV(request.getLowerCountOfMCV());
        }
        if (null != request.getCountOfMCH()) {
            labTestsAfterUpdate.setCountOfMCH(request.getCountOfMCH());
        }
        if (null != request.getUpperCountOfMCH()) {
            labTestsAfterUpdate.setUpperCountOfMCH(request.getUpperCountOfMCH());
        }

    }

    public void updateLabTestsForm3(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getLowerCountOfMCH()) {
            labTestsAfterUpdate.setLowerCountOfMCH(request.getLowerCountOfMCH());
        }
        if (null != request.getCountOfMCHC()) {
            labTestsAfterUpdate.setCountOfMCHC(request.getCountOfMCHC());
        }
        if (null != request.getUpperCountOfMCHC()) {
            labTestsAfterUpdate.setUpperCountOfMCHC(request.getUpperCountOfMCHC());
        }
        if (null != request.getLowerCountOfMCHC()) {
            labTestsAfterUpdate.setLowerCountOfMCHC(request.getLowerCountOfMCHC());
        }
        if (null != request.getValueOfTSH()) {
            labTestsAfterUpdate.setValueOfTSH(request.getValueOfTSH());
        }
        if (null != request.getUpperValueOfTSH()) {
            labTestsAfterUpdate.setUpperValueOfTSH(request.getUpperValueOfTSH());
        }
        if (null != request.getLowerValueOfTSH()) {
            labTestsAfterUpdate.setLowerValueOfTSH(request.getLowerValueOfTSH());
        }
        if (null != request.getValueOfTLC()) {
            labTestsAfterUpdate.setValueOfTLC(request.getValueOfTLC());
        }
        if (null != request.getUpperValueOfTLC()) {
            labTestsAfterUpdate.setUpperValueOfTLC(request.getUpperValueOfTLC());
        }
        if (null != request.getLowerValueOfTLC()) {
            labTestsAfterUpdate.setLowerValueOfTLC(request.getLowerValueOfTLC());
        }
        if (null != request.getValueOfNeutrophil()) {
            labTestsAfterUpdate.setValueOfNeutrophil(request.getValueOfNeutrophil());
        }
        if (null != request.getUpperValueOfNeutrophil()) {
            labTestsAfterUpdate.setUpperValueOfNeutrophil(request.getUpperValueOfNeutrophil());
        }
        if (null != request.getLowerValueOfNeutrophil()) {
            labTestsAfterUpdate.setLowerValueOfNeutrophil(request.getLowerValueOfNeutrophil());
        }
        if (null != request.getValueOfEsoinophil()) {
            labTestsAfterUpdate.setValueOfEsoinophil(request.getValueOfEsoinophil());
        }
        if (null != request.getUpperValueOfEsoinophil()) {
            labTestsAfterUpdate.setUpperValueOfEsoinophil(request.getUpperValueOfEsoinophil());
        }

    }

    public void updateLabTestsForm4(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getLowerValueOfEsoinophil()) {
            labTestsAfterUpdate.setLowerValueOfEsoinophil(request.getLowerValueOfEsoinophil());
        }
        if (null != request.getValueOfBasophil()) {
            labTestsAfterUpdate.setValueOfBasophil(request.getValueOfBasophil());
        }
        if (null != request.getUpperValueOfBasophil()) {
            labTestsAfterUpdate.setUpperValueOfBasophil(request.getUpperValueOfBasophil());
        }
        if (null != request.getLowerValueOfBasophil()) {
            labTestsAfterUpdate.setLowerValueOfBasophil(request.getLowerValueOfBasophil());
        }
        if (null != request.getValueOfMonocyte()) {
            labTestsAfterUpdate.setValueOfMonocyte(request.getValueOfMonocyte());
        }
        if (null != request.getUpperValueOfMonocyte()) {
            labTestsAfterUpdate.setUpperValueOfMonocyte(request.getUpperValueOfMonocyte());
        }
        if (null != request.getLowerValueOfMonocyte()) {
            labTestsAfterUpdate.setLowerValueOfMonocyte(request.getLowerValueOfMonocyte());
        }
        if (null != request.getValueOfLymphocyte()) {
            labTestsAfterUpdate.setValueOfLymphocyte(request.getValueOfLymphocyte());
        }
        if (null != request.getUpperValueOfLymphocyte()) {
            labTestsAfterUpdate.setUpperValueOfLymphocyte(request.getUpperValueOfLymphocyte());
        }
        if (null != request.getLowerValueOfLymphocyte()) {
            labTestsAfterUpdate.setLowerValueOfLymphocyte(request.getLowerValueOfLymphocyte());
        }
        if (null != request.getCountOfPlatelet()) {
            labTestsAfterUpdate.setCountOfPlatelet(request.getCountOfPlatelet());
        }
        if (null != request.getUpperCountOfPlatelet()) {
            labTestsAfterUpdate.setUpperCountOfPlatelet(request.getUpperCountOfPlatelet());
        }
        if (null != request.getLowerCountOfPlatelet()) {
            labTestsAfterUpdate.setLowerCountOfPlatelet(request.getLowerCountOfPlatelet());
        }
        if (null != request.getValueOfESR()) {
            labTestsAfterUpdate.setValueOfESR(request.getValueOfESR());
        }
        if (null != request.getUpperValueOfESR()) {
            labTestsAfterUpdate.setUpperValueOfESR(request.getUpperValueOfESR());
        }

    }

    public void updateLabTestsForm5(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getLowerValueOfESR()) {
            labTestsAfterUpdate.setLowerValueOfESR(request.getLowerValueOfESR());
        }
        if (null != request.getValueOfFBS()) {
            labTestsAfterUpdate.setValueOfFBS(request.getValueOfFBS());
        }
        if (null != request.getUpperValueOfFBS()) {
            labTestsAfterUpdate.setUpperValueOfFBS(request.getUpperValueOfFBS());
        }
        if (null != request.getLowerValueOfFBS()) {
            labTestsAfterUpdate.setLowerValueOfFBS(request.getLowerValueOfFBS());
        }
        if (null != request.getValueOfHbA1C()) {
            labTestsAfterUpdate.setValueOfHbA1C(request.getValueOfHbA1C());
        }
        if (null != request.getUpperValueOfHbA1C()) {
            labTestsAfterUpdate.setUpperValueOfHbA1C(request.getUpperValueOfHbA1C());
        }
        if (null != request.getLowerValueOfHbA1C()) {
            labTestsAfterUpdate.setLowerValueOfHbA1C(request.getLowerValueOfHbA1C());
        }
        if (null != request.getValueOfSerumCreatinineRFT()) {
            labTestsAfterUpdate.setValueOfSerumCreatinineRFT(request.getValueOfSerumCreatinineRFT());
        }
        if (null != request.getUpperValueOfSerumCreatinineRFT()) {
            labTestsAfterUpdate.setUpperValueOfSerumCreatinineRFT(request.getUpperValueOfSerumCreatinineRFT());
        }
        if (null != request.getLowerValueOfSerumCreatinineRFT()) {
            labTestsAfterUpdate.setLowerValueOfSerumCreatinineRFT(request.getLowerValueOfSerumCreatinineRFT());
        }
        if (null != request.getAmountOfUricAcid()) {
            labTestsAfterUpdate.setAmountOfUricAcid(request.getAmountOfUricAcid());
        }
        if (null != request.getUpperAmountOfUricAcid()) {
            labTestsAfterUpdate.setUpperAmountOfUricAcid(request.getUpperAmountOfUricAcid());
        }
        if (null != request.getLowerAmountOfUricAcid()) {
            labTestsAfterUpdate.setLowerAmountOfUricAcid(request.getLowerAmountOfUricAcid());
        }
        if (null != request.getValueOfSGOTAST()) {
            labTestsAfterUpdate.setValueOfSGOTAST(request.getValueOfSGOTAST());
        }
        if (null != request.getUpperValueOfSGOTAST()) {
            labTestsAfterUpdate.setUpperValueOfSGOTAST(request.getUpperValueOfSGOTAST());
        }

    }

    public void updateLabTestsForm6(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getLowerValueOfSGOTAST()) {
            labTestsAfterUpdate.setLowerValueOfSGOTAST(request.getLowerValueOfSGOTAST());
        }
        if (null != request.getValueOfSGPTALT()) {
            labTestsAfterUpdate.setValueOfSGPTALT(request.getValueOfSGPTALT());
        }
        if (null != request.getUpperValueOfSGPTALT()) {
            labTestsAfterUpdate.setUpperValueOfSGPTALT(request.getUpperValueOfSGPTALT());
        }
        if (null != request.getLowerValueOfSGPTALT()) {
            labTestsAfterUpdate.setLowerValueOfSGPTALT(request.getLowerValueOfSGPTALT());
        }
        if (null != request.getRatioBetweenSGOTAndSGPT()) {
            labTestsAfterUpdate.setRatioBetweenSGOTAndSGPT(request.getRatioBetweenSGOTAndSGPT());
        }
        if (null != request.getValueOfBUN()) {
            labTestsAfterUpdate.setValueOfBUN(request.getValueOfBUN());
        }
        if (null != request.getUpperValueOfBUN()) {
            labTestsAfterUpdate.setUpperValueOfBUN(request.getUpperValueOfBUN());
        }
        if (null != request.getLowerValueOfBUN()) {
            labTestsAfterUpdate.setLowerValueOfBUN(request.getLowerValueOfBUN());
        }
        if (null != request.getValueOfNA()) {
            labTestsAfterUpdate.setValueOfNA(request.getValueOfNA());
        }
        if (null != request.getUpperValueOfNA()) {
            labTestsAfterUpdate.setUpperValueOfNA(request.getUpperValueOfNA());
        }
        if (null != request.getLowerValueOfBUN()) {
            labTestsAfterUpdate.setLowerValueOfBUN(request.getLowerValueOfBUN());
        }
        if (null != request.getValueOfK()) {
            labTestsAfterUpdate.setValueOfK(request.getValueOfK());
        }
        if (null != request.getUpperValueOfK()) {
            labTestsAfterUpdate.setUpperValueOfK(request.getUpperValueOfK());
        }
        if (null != request.getLowerValueOfK()) {
            labTestsAfterUpdate.setLowerValueOfK(request.getLowerValueOfK());
        }
        if (null != request.getValueOfCA()) {
            labTestsAfterUpdate.setValueOfCA(request.getValueOfCA());
        }

    }

    public void updateLabTestsForm7(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getUpperValueOfCA()) {
            labTestsAfterUpdate.setUpperValueOfCA(request.getUpperValueOfCA());
        }
        if (null != request.getLowerValueOfCA()) {
            labTestsAfterUpdate.setLowerValueOfCA(request.getLowerValueOfCA());
        }
        if (null != request.getValueOfPO4()) {
            labTestsAfterUpdate.setValueOfPO4(request.getValueOfPO4());
        }
        if (null != request.getUpperValueOfPO4()) {
            labTestsAfterUpdate.setUpperValueOfPO4(request.getUpperValueOfPO4());
        }
        if (null != request.getLowerValueOfPO4()) {
            labTestsAfterUpdate.setLowerValueOfPO4(request.getLowerValueOfPO4());
        }
        if (null != request.getValueOfCI()) {
            labTestsAfterUpdate.setValueOfCI(request.getValueOfCI());
        }
        if (null != request.getUpperValueOfCI()) {
            labTestsAfterUpdate.setUpperValueOfCI(request.getUpperValueOfCI());
        }
        if (null != request.getLowerValueOfCI()) {
            labTestsAfterUpdate.setLowerValueOfCI(request.getLowerValueOfCI());
        }
        if (null != request.getValueOfHCO3()) {
            labTestsAfterUpdate.setValueOfHCO3(request.getValueOfHCO3());
        }
        if (null != request.getUpperValueOfHCO3()) {
            labTestsAfterUpdate.setUpperValueOfHCO3(request.getUpperValueOfHCO3());
        }
        if (null != request.getLowerValueOfHCO3()) {
            labTestsAfterUpdate.setLowerValueOfHCO3(request.getLowerValueOfHCO3());
        }
        if (null != request.getValueOfGGT()) {
            labTestsAfterUpdate.setValueOfGGT(request.getValueOfGGT());
        }
        if (null != request.getUpperValueOfGGT()) {
            labTestsAfterUpdate.setUpperValueOfGGT(request.getUpperValueOfGGT());
        }
        if (null != request.getLowerValueOfGGT()) {
            labTestsAfterUpdate.setLowerValueOfGGT(request.getLowerValueOfGGT());
        }
        if (null != request.getValueOfALP()) {
            labTestsAfterUpdate.setValueOfALP(request.getValueOfALP());
        }

    }

    public void updateLabTestsForm8(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getUpperValueOfALP()) {
            labTestsAfterUpdate.setUpperValueOfALP(request.getUpperValueOfALP());
        }
        if (null != request.getLowerValueOfALP()) {
            labTestsAfterUpdate.setLowerValueOfALP(request.getLowerValueOfALP());
        }
        if (null != request.getValueOfTotalBilirubin()) {
            labTestsAfterUpdate.setValueOfTotalBilirubin(request.getValueOfTotalBilirubin());
        }
        if (null != request.getUpperValueOfTotalBilirubin()) {
            labTestsAfterUpdate.setUpperValueOfTotalBilirubin(request.getUpperValueOfTotalBilirubin());
        }
        if (null != request.getLowerValueOfTotalBilirubin()) {
            labTestsAfterUpdate.setLowerValueOfTotalBilirubin(request.getLowerValueOfTotalBilirubin());
        }
        if (null != request.getValueOfSerumAlbumin()) {
            labTestsAfterUpdate.setValueOfSerumAlbumin(request.getValueOfSerumAlbumin());
        }
        if (null != request.getUpperValueOfSerumAlbumin()) {
            labTestsAfterUpdate.setUpperValueOfSerumAlbumin(request.getUpperValueOfSerumAlbumin());
        }
        if (null != request.getLowerValueOfSerumAlbumin()) {
            labTestsAfterUpdate.setLowerValueOfSerumAlbumin(request.getValueOfSerumAlbumin());
        }
        if (null != request.getValueOfUrineMicroAlbumin()) {
            labTestsAfterUpdate.setValueOfUrineMicroAlbumin(request.getValueOfUrineMicroAlbumin());
        }
        if (null != request.getUpperValueOfUrineMicroAlbumin()) {
            labTestsAfterUpdate.setUpperValueOfUrineMicroAlbumin(request.getUpperValueOfUrineMicroAlbumin());
        }
        if (null != request.getLowerValueOfUrineMicroAlbumin()) {
            labTestsAfterUpdate.setLowerValueOfUrineMicroAlbumin(request.getLowerValueOfUrineMicroAlbumin());
        }
        if (null != request.getValueOfTotalProtein()) {
            labTestsAfterUpdate.setValueOfTotalProtein(request.getValueOfTotalProtein());
        }
        if (null != request.getUpperValueOfTotalProtein()) {
            labTestsAfterUpdate.setUpperValueOfTotalProtein(request.getUpperValueOfTotalProtein());
        }
        if (null != request.getLowerValueOfTotalProtein()) {
            labTestsAfterUpdate.setLowerValueOfTotalProtein(request.getLowerValueOfTotalProtein());
        }
        if (null != request.getValueOfPSA()) {
            labTestsAfterUpdate.setValueOfPSA(request.getValueOfPSA());
        }

    }

    public void updateLabTestsForm9(LabTests labTestsAfterUpdate, UpdateLabTests request) {

        if (null != request.getUpperValueOfPSA()) {
            labTestsAfterUpdate.setUpperValueOfPSA(request.getUpperValueOfPSA());
        }
        if (null != request.getLowerValueOfPSA()) {
            labTestsAfterUpdate.setLowerValueOfPSA(request.getLowerValueOfPSA());
        }
        if (null != request.getValueOfTC()) {
            labTestsAfterUpdate.setValueOfTC(request.getValueOfTC());
        }
        if (null != request.getUpperValueOfTC()) {
            labTestsAfterUpdate.setUpperValueOfTC(request.getUpperValueOfTC());
        }
        if (null != request.getLowerValueOfTC()) {
            labTestsAfterUpdate.setLowerValueOfTC(request.getLowerValueOfTC());
        }
        if (null != request.getValueOfLDL()) {
            labTestsAfterUpdate.setValueOfLDL(request.getValueOfLDL());
        }
        if (null != request.getUpperValueOfLDL()) {
            labTestsAfterUpdate.setUpperValueOfLDL(request.getUpperValueOfLDL());
        }
        if (null != request.getLowerValueOfLDL()) {
            labTestsAfterUpdate.setLowerValueOfLDL(request.getLowerValueOfLDL());
        }
        if (null != request.getHeartRate()) {
            labTestsAfterUpdate.setHeartRate(request.getHeartRate());
        }
        if (null != request.getValueOfHDL()) {
            labTestsAfterUpdate.setValueOfHDL(request.getValueOfHDL());
        }
        if (null != request.getValueOfHB()) {
            labTestsAfterUpdate.setValueOfHB(request.getValueOfHB());
        }
        if (null != request.getPercentageOfLVEF()) {
            labTestsAfterUpdate.setPercentageOfLVEF(request.getPercentageOfLVEF());
        }

    }

}
