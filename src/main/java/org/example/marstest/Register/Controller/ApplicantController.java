package org.example.marstest.Register.Controller;


import org.example.marstest.Register.Model.Applicant;
import org.example.marstest.Register.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/mars")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping("/register")
    public Applicant createApplicant(@RequestBody Applicant applicant) {

        return applicantService.save(applicant);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Applicant> getAppById(@PathVariable String id) {

        Optional<Applicant> applicant = applicantService.findOne(id);

        return applicant.map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Applicant> getAllApplicants() {

        return applicantService.findAll();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Applicant> editApplicant(@PathVariable String id,
                                                   @RequestBody Applicant applicant) {

        Optional<Applicant> editApp = applicantService.updateApplicants(applicant, id);

        return editApp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteApplicantById(@PathVariable String id) {

        applicantService.deleteById(id);
    }
}
