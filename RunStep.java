package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/features/CreateLead1.feature" , glue ="testSteps" , monochrome = true 
				/*dryRun = true, snippets=SnippetType.CAMELCASE*/)

public class RunStep extends AbstractTestNGCucumberTests{

	
	
}
