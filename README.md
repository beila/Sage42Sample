Sage42 - Sample Project 
=======================

Basic Sample Android App Structure with Gradle Support

Intention is to provide a basic common skeleton that can be quickly copied and used to get the project started and ready to use with Sonar and Jenkins.

Gradle
-------
To build use:
gradle clean build

To run sonar analysis:
gradle sonarRunner

To run Android Tests (vanilla, Robotium, etc)
gradle connectedInstrumentTest
