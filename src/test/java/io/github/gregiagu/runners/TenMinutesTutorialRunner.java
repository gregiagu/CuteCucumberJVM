package io.github.gregiagu.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/ten-minutes-tutorial.feature")
@ConfigurationParameter( key = GLUE_PROPERTY_NAME, value = "io.github.gregiagu.definitions" )
@ConfigurationParameter( key = PLUGIN_PROPERTY_NAME, value = "pretty,json:target/report/ten-minutes-tutorial.json" )
public class TenMinutesTutorialRunner {
}
