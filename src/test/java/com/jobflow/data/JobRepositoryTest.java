package com.jobflow.data;

import com.jobflow.data.entity.Job;
import com.jobflow.data.entity.JobRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class JobRepositoryTest {

  @Autowired
  JobRepository subject;

  @Test
  public void myTest() throws Exception {
    Job ss = subject.save(new Job().builder().name("name").build());
    List<Job> all = subject.findAllByName("name");
    Job ss1 = subject.save(new Job().builder().name("name").build());

  }
}
