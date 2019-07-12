package com.jobsflow.api.repository;

import java.util.List;

import com.jobsflow.api.model.Jobs;
import com.jobsflow.data.entity.JobEntity;
import com.jobsflow.data.entity.JobRepository;
import com.jobsflow.api.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
