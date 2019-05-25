package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/features/createLead.feature",
glue="steps",monochrome = true/*, dryRun = true, snippets=SnippetType.CAMELCASE*/)

public class TC0002CreateLeadRunTest extends AbstractTestNGCucumberTests{

}
