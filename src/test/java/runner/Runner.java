package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= {"src\\test\\java\\features\\Login.feature"},
                                  glue="steps",
                                  dryRun=false,
                                  monochrome =false,
                                  publish=true,
                                  snippets = SnippetType.CAMELCASE)
public class Runner extends AbstractTestNGCucumberTests{

}
