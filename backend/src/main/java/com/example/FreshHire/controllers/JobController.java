package com.example.FreshHire.controllers;

import com.example.FreshHire.model.Job;
import com.example.FreshHire.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class JobController {
    private  final JobService jobService;
    @Autowired
    public JobController (JobService jobService){
        this.jobService=jobService;
    }
    
    @GetMapping("/api/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        var result = jobService.getAllJobs();
        if(result != null)
            return ResponseEntity.ok(result);
        else
            return  ResponseEntity.notFound().build();
    }
    @GetMapping("/api/jobs/{id}")
    public ResponseEntity<Object> getJobById(@PathVariable Long id){
        Optional<Job> jobById = jobService.getJobById(id);
        if(jobById.isPresent()){
            return ResponseEntity.ok(jobById.get());
        }
        else {
            return  ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/api/jobs")
    public ResponseEntity<Job> createJob(@Valid @RequestBody Job job){
            Job createdJob  =  jobService.createJob(job);
            return ResponseEntity.ok(createdJob);
    }
    @DeleteMapping("/api/jobs/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id){
        if(jobService.getJobById(id).isPresent()){
            jobService.deleteJob(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

//    @PutMapping("/api/jobs/{id}")
//    public  ResponseEntity<Job> updateJob(@PathVariable Long id){
//
//    }
}
