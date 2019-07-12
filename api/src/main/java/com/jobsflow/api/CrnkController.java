package com.jobsflow.api;

import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;

import io.crnk.spring.boot.v3.CrnkConfigV3;

@RestController
@Import({CrnkConfigV3.class})
public class CrnkController {
}
