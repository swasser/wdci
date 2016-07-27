package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.basics.manipulate.ManipulateExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.SendKeysExamplesTest;
import com.seleniumsimplified.webdriver.basics.manipulate.alerts.AlertHandlingExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.selectSupport.SelectSupportTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A simple suite that contains just the Interrogation tests
 * as an example of how to collate specific Test Classes into
 * a Suite
 *
 * Can run the suite with
 *
 * mvn clean -Dtest=ManipulateOnlySuite test
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AlertHandlingExampleTest.class,
        SelectSupportTest.class,
        ManipulateExampleTest.class,
        SendKeysExamplesTest.class,
})
public class ManipulateOnlySuite {
}
