package com.jobflow.api.model;

import com.jobflow.api.model.Job;
import com.jobflow.data.entity.JobEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Jobs {
  public static Job fromEntity(JobEntity entity){
    return new Job(entity.getId(), entity.getName());
  }

  public static List<Job> fromEntities(List<JobEntity> entities){
    return entities.stream().map(Jobs::fromEntity).collect(Collectors.toList());
  }
}
