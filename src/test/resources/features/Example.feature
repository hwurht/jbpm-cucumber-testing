Feature: Example

  Scenario: Test
    Given the following process files:
      | com/pamtests/examplecucumberproject/ExampleProcessOne.bpmn |
    Given the process definition ID "ExampleCucumberProject.ExampleProcessOne"
    Given a process parameter "message" with value "hello world"
    When the process is started
    Then the following nodes were triggered:
      | Print |
    Then the process completed
    Then the process is not active
