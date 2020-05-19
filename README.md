# JBPM Process Testing Using Cucumber

This project hopes to make testing of JBPM processes with Cucumber easier by implementing some useful integrations and default step definitions.  Here are the features:

1. BPMN assets to be tested are included as a dependency in the [pom.xml](pom.xml) file.  This way the tests can be separate from the process definitions.
2. Default [step definitions](src/test/java/org/jbpm/cucumber/DefaultStepDefinitions.java) and [example feature file](src/test/resources/features/Example.feature) define an easy way to interact with processes.
3. An [example custom step definition file](src/test/java/org/jbpm/cucumber/custom/CustomStepDefinitions.java) is included to add custom interactions.
4. A [JBPM Test Utility class](src/test/java/org/jbpm/cucumber/JbpmTestUtil.java) is used for both default and custom step definitions and is based on the [JbpmUnitBaseTestCase class](https://github.com/kiegroup/jbpm/blob/master/jbpm-test/src/main/java/org/jbpm/test/JbpmJUnitBaseTestCase.java) so many of the useful assertions can be leveraged
5. The [Cucumber Picocontainer](https://github.com/cucumber/cucumber-jvm/tree/master/picocontainer) is used to share the running process state (in the JbpmTestUtil class) between the default and custom step definition files.

Instructions:

1. Clone this repo.
2. If using and IDE, I would recommend adding the [Cucumber plugin](https://cucumber.io/docs/tools/java/)
3. Include your own KJAR(s) in the [pom.xml](pom.xml) file.
4. Modify the existing [custom step definition file](src/test/java/org/jbpm/cucumber/custom/CustomStepDefinitions.java) or create your own and add custom step definitions there.
5. Create your own .feature file in the org.jbpm.cucumber.features folder using [Example.feature](src/test/resources/features/Example.feature) as reference.
6. Run the test using `mvn clean test` or test through your IDE.

TODO:

1. Add [custom type](https://cucumber.io/docs/cucumber/cucumber-expressions/#parameter-types) example for process parameters.
2. Add example on interaction with BPMN tasks.
3. Add drools support (maybe another repo).
