package org.example.marstest.Register.Service;

import org.example.marstest.Register.Model.Applicant;
import org.example.marstest.Register.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

//    @Autowired
//    public ApplicantService(ApplicantRepository applicantRepository) {
//
//        this.applicantRepository = applicantRepository;
//    }

    public Applicant save(Applicant applicant) {

        return applicantRepository.save(applicant);
    }

    public Optional<Applicant> findOne(String id) {

        return applicantRepository.findById(id);
    }

    public List<Applicant> findAll() {

        List<Applicant> applicants = new ArrayList<>();
        applicantRepository.findAll().forEach(applicants::add);

        return applicants;
    }

    public Optional<Applicant> updateApplicants(Applicant applicant, String id) {

        return applicantRepository.findById(id).map(currentApplication -> {

            if (applicant.getName() != null) {
                currentApplication.setName(applicant.getName());

            }
            if (applicant.getPhone() != null) {
                currentApplication.setPhone(applicant.getPhone());

            }
            if (applicant.getAddress() != null) {
                currentApplication.setAddress(applicant.getAddress());

            }
            if (applicant.getImgUrl() != null) {
                currentApplication.setImgUrl(applicant.getImgUrl());
            }

           return applicantRepository.save(currentApplication);
        });
    }

    public void deleteById(String id) {

        applicantRepository.deleteById(id);
    }
}
