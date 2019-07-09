package com.decisiv.jobs.service;

import com.decisiv.jobs.entity.Job;
import com.decisiv.jobs.entity.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

  @Autowired
  private final JobRepository addressRepository;

  public JobService(JobRepository addressRepository){
    this.addressRepository = addressRepository;
  }

  public void createJob(Job address){
    addressRepository.save(address);
  }
}
