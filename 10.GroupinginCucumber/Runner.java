package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions(features= {"src\\test\\java\\features\\Login.feature"},
                                  glue="steps",
                                  dryRun=false,
                                  monochrome =false,
                                  publish=true,
                                  snippets = SnippetType.CAMELCASE,
                                  tags="@Regression")
public class Runner extends BaseClass{

}
