package com.jobflow.data;

import com.jobflow.data.entity.JobEntity;
import com.jobflow.data.entity.JobRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest(classes = Application.class)
public class JobRepositoryTest {

  @Autowired
  JobRepository subject;

  @Test
  public void myTest() throws Exception {
    JobEntity ss = subject.saveAndFlush(JobEntity.builder().name("name").build());
    List<JobEntity> all = subject.findAllByName("name");
    JobEntity ss1 = subject.saveAndFlush(JobEntity.builder().name("name").build());

  }
}
