package com.jobsflow.api.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonApiResource(type = "v1/jobs")
public class Job {

  @JsonApiId
  private UUID id;

  private String name;
}
