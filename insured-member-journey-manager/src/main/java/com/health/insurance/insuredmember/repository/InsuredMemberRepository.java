package com.health.insurance.insuredmember.repository;

import com.health.insurance.insuredmember.model.entity.InsuredMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuredMemberRepository extends JpaRepository<InsuredMember, Integer> {

    List<InsuredMember> findInsuredMemberListById(Integer insuredMemberId);

    InsuredMember findInsuredMemberById(Integer insuredMemberId);

}
