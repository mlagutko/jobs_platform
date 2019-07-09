package com.jobflow.api.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

  private Map<Long, Job> greetings = new HashMap<>();

  public JobRepositoryImpl() {
    super(Job.class);

    greetings.put(1L, new Job(UUID.randomUUID(), "Hello World!"));
  }

  @Override
  public ResourceList<Job> findAll(QuerySpec querySpec) {
    return querySpec.apply(greetings.values());
  }
}
