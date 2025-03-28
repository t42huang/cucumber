package hellocucumber.runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.*;




@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber") // 确保特性文件在 classpath 中
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "hellocucumber.stepDefinitions" // 明确指定步骤定义包
 )
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:target/cucumber-reports/cucumber.html, json:target/cucumber-reports/cucumber.json"
)
@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "not @WIP" // 可选：过滤不需要执行的标签
)
public class RunCucumberTest {
}