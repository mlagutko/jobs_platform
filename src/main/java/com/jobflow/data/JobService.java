package com.jobflow.data;

import com.jobflow.data.entity.Job;
import com.jobflow.data.entity.JobRepository;
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
