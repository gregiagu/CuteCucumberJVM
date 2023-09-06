package io.github.gregiagu.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/what-is-cucumber.feature")
@ConfigurationParameter( key = GLUE_PROPERTY_NAME, value = "io.github.gregiagu.definitions" )
@ConfigurationParameter( key = PLUGIN_PROPERTY_NAME, value = "pretty,json:target/report/what-is-cucumber.json" )
public class WhatIsCucumberRunner {
}
