package org.example.marstest.Register.Repository;

import org.example.marstest.Register.Model.Applicant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ApplicantRepository extends ElasticsearchRepository<Applicant, String> {

//    List<Applicant> findByName(String name);


}
