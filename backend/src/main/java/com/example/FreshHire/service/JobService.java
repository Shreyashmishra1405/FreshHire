package com.example.FreshHire.service;

import com.example.FreshHire.model.Job;
import com.example.FreshHire.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;
    public List<Job> getAllJobs (){
        return jobRepository.findAll();
    }
    public Optional<Job> getJobById(Long id){
        return jobRepository.findById(id);
    }

    public Job createJob(Job job){
        if(job.getPostedDate()==null){
            job.setPostedDate(LocalDate.now());
        }
        return jobRepository.save(job);
    }
    public void deleteJob(Long id){
        jobRepository.deleteById(id);
    }
}
