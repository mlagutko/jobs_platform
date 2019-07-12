package com.jobsflow.data;

import com.jobsflow.data.entity.JobEntity;
import com.jobsflow.data.entity.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

  @Autowired
  private final JobRepository jobRepository;

  public JobService(JobRepository jobRepository){
    this.jobRepository = jobRepository;
  }

  public void createJob(JobEntity address){
    jobRepository.save(address);
  }
}
