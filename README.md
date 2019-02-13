# cucumber-examples
This repository contains some examples of feature files, step defintions and framework integration.

Since there are some non backwarrd compatible changes between cucumber versions, there are two branches with different versions to explain the main changes.

NOTICE: We're using cucumber-jvm (lastest version uses cucumber 4), so it's not up-to-date with the latest cucumber features, like 'Rule', available only on cucumber 6.

The branch feature/cucumber-2 is using info.cukes groups with cucumebr 1.2.5.
The branch feature/cucumber-3 is using io.cucumber group with cucumber 3.0.2.

The main differences between these versions are:

Cucumber 1.2.5:
 - Transformers;
 - No required configuration for datatables;
 - No support for tag expressions; - check https://github.com/cucumber/cucumber/tree/master/tag-expressions
 - No support for BeforeStep and AfterStep hooks.
 
Cucumber 3:
 - Transformers no longer work; - more details on https://cucumber.io/blog/2018/05/19/announcing-cucumber-jvm-3-0-0
 - Required configuration for DataTable with 'DataTableConfigurerer' interface.
 - Cucumber expressions: on step definitions you can use the types instead of regex, e.g., {string}
 - BeforeStep and AfterStep annotation hooks.

# Selenium integration

To run the selenium based tests, you need to add the 'chromedriver' file to 'src/tests/resources/webdrivers' package. Any changes concerning the webdriver path can be done on 'src/tests/java/utils/Browser.java' class.
You can download a compatible version of 'chromedriver' with your current 'chrome' installation on the following link: https://sites.google.com/a/chromium.org/chromedriver/downloads/version-selection



