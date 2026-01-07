package com.application.service.bank;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests;
import org.camunda.bpm.spring.boot.starter.test.helper.AbstractProcessEngineRuleTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WorkflowTest extends AbstractProcessEngineRuleTest {

  @Autowired
  public RuntimeService runtimeService;

  @Value("process.definitionKey")
  public String processDefinitionKey;

  @Test
  public void shouldExecuteHappyPath() {

    // when
    final ProcessInstance processInstance = this.runtimeService.startProcessInstanceByKey(this.processDefinitionKey);

    // then
    BpmnAwareTests.assertThat(processInstance).isStarted()
        .task()
        .hasDefinitionKey("say-hello")
        .hasCandidateUser("demo")
        .isNotAssigned();
  }

}
