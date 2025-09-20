package com.example.FreshHire.repository;

import com.example.FreshHire.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository  extends JpaRepository <Job,Long> {
}
