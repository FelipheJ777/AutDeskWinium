package br.com.runTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import br.com.projeto.commons.BaseTest;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Feliphe Jesus
 * @since September, 2020
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/cucumber.json"
        },
        features = {
                "./src/test/resources/features/web",
                "./src/test/resources/features/desktop"
        },
        glue = {
                "br.com.projeto.web.steps",
                "br.com.projeto.desktop.steps",
                "br.com.projeto.configuration",
                "br.com.projeto.commons",
                "br.com.projeto.bean"
        },
        tags = "@desktop")

public class RunTest extends BaseTest {
}
