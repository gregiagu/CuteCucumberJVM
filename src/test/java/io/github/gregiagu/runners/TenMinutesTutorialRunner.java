package io.github.gregiagu.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/ten-minutes-tutorial.feature")
@ConfigurationParameter( key = GLUE_PROPERTY_NAME, value = "io.github.gregiagu.definitions" )
public class TenMinutesTutorialRunner {
}
