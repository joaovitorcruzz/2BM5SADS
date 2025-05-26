package com.example._BM5SADS.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<JobModel> findAll(){
        return  jobRepository.findAll();
    }
    public JobModel criar(JobModel jobModel){
        return jobRepository.save(jobModel);
    }
}
