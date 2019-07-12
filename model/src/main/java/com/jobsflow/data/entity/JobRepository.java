package com.jobsflow.data.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
  List<JobEntity> findAllByName(String name);
}
