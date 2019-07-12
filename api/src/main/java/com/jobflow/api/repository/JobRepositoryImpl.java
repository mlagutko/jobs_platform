package com.jobflow.api.repository;

import java.util.List;

import com.jobflow.api.model.Jobs;
import com.jobflow.data.entity.JobEntity;
import com.jobflow.data.entity.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jobflow.api.model.Job;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

@Component
public class JobRepositoryImpl extends ResourceRepositoryBase<Job, Long> {

  @Autowired
  JobRepository jobRepository;

  public JobRepositoryImpl() {
    super(Job.class);

  }

  @Override
  public ResourceList<Job> findAll(QuerySpec querySpec) {
    ensureJobExists();
    return querySpec.apply(Jobs.fromEntities(jobRepository.findAll()));
  }

  private void ensureJobExists() {
    List<JobEntity> jobs = jobRepository.findAll();
    if (jobs.isEmpty())
      jobRepository.saveAndFlush(JobEntity.builder().name("name").build());
  }
}
