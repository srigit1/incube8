# incube8
Prerequisites to run :

1.Install Java,Maven,Chrome browser.
2.Import the project as Maven project
3.Clean and build the project.(mvn clean install)
3.Go to TestRunner (src/test/java/runner/TestRunner.java) and run as junit test

Framework used and steps followed:

1.Implemented with BDD Framework with cucumber.
2.Used Page Object Model for code readability and reusability.
3.Listed manual testcases for Search Functionality in Search ManualTC.feature in(src/test/resources/Features)
4.Listed automation testcases for Question1 and 2 in AutomationTC.feature in (src/test/resources/Features)
5.Has written step definitions for the Automation scenarios.
6.Added pretty report plugin for reporting purpose.Can refer index.html in targets folder to refer execution status



Best Practices followed:

1.Used Singleton Design Pattern.
2.Used Page Object Model
3.WebDriver intialisation is done in Init Class outside the code
4.Loaded the application url and chromedriver path from the properties file
5.Required testdata is passed from the Examples in feature.

Able to complete the test successfully with all the scenarios 


