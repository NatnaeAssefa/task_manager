package org.farka.taskmanager.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.farka.taskmanager.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
