package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/duplicateLead.feature",
glue="steps",monochrome = true/*, dryRun = true, snippets=SnippetType.CAMELCASE*/)

public class TC0005DuplicateLeadRunTest extends AbstractTestNGCucumberTests{

}
