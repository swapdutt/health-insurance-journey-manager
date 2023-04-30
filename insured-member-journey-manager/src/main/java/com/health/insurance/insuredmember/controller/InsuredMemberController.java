package com.health.insurance.insuredmember.controller;

import com.health.insurance.insuredmember.exception.RecordExistException;
import com.health.insurance.insuredmember.exception.RecordNotFoundException;
import com.health.insurance.insuredmember.model.dto.CreateInsuredMember;
import com.health.insurance.insuredmember.model.dto.UpdateInsuredMember;
import com.health.insurance.insuredmember.model.entity.InsuredMember;
import com.health.insurance.insuredmember.service.InsuredMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/health-insurance/insuredMember")
public class InsuredMemberController {


    InsuredMemberService insuredMemberService;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InsuredMember>> findAllInsuredMembers() throws RecordNotFoundException {
        return new ResponseEntity<>(insuredMemberService.findAllInsuredMembers(), HttpStatus.OK);
    }

    @GetMapping(path = "/{insuredMemberId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InsuredMember> findInsuredMemberById(@PathVariable("insuredMemberId") final Integer insuredMemberId) throws RecordNotFoundException {
        return new ResponseEntity<>(insuredMemberService.findInsuredMemberById(insuredMemberId), HttpStatus.OK);
    }

    @PostMapping(path = "/create-insured-member", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InsuredMember> createInsuredMemberRecord(@RequestBody final CreateInsuredMember request) throws RecordExistException {
        return new ResponseEntity<>(insuredMemberService.createInsuredMemberRecord(request), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{insuredMemberId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InsuredMember> updateInsuredMemberRecord(@PathVariable("insuredMemberId") final Integer insuredMemberId, @RequestBody final UpdateInsuredMember request) throws RecordNotFoundException {
        return new ResponseEntity<>(insuredMemberService.updateInsuredMemberRecord(insuredMemberId, request), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{insuredMemberId}")
    public ResponseEntity<Boolean> deleteInsuredMemberById(@PathVariable("insuredMemberId") final Integer insuredMemberId) throws RecordNotFoundException {
        insuredMemberService.deleteInsuredMemberById(insuredMemberId);
        return ResponseEntity.ok(true);
    }

}
