package org.jbpm.cucumber.custom;

import static org.junit.Assert.assertNotNull;

import org.jbpm.cucumber.JbpmTestUtil;

import io.cucumber.java.en.Then;

public class CustomStepDefinitions {
    private JbpmTestUtil testUtil;

    public CustomStepDefinitions(JbpmTestUtil testUtil) {
        assertNotNull(testUtil);
        this.testUtil = testUtil;
    }
    
    @Then("the process is not active")
    public void processNotActive() {
        assertNotNull(testUtil.getProcessInstance());
        assertNotNull(testUtil.getKieSession());
        testUtil.assertProcessInstanceNotActive(testUtil.getProcessInstance().getId(), testUtil.getKieSession());
    }

}
