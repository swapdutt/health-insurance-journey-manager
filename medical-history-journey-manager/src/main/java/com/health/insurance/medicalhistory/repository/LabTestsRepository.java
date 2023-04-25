package com.health.insurance.medicalhistory.repository;

import com.health.insurance.medicalhistory.model.utility.entity.LabTests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabTestsRepository extends JpaRepository<LabTests, Integer> {

    List<LabTests> findLabTestsListById(Integer labTestsId);

}
