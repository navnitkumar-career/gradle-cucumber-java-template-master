# Gradle Cucumber-JVM template project

## Requirements

* Java 7+

## Optional requirements

* Gradle 
* Intellij

## Setup

There are currently two cucumber feature files. One tests an external site (BBC News) and another internal (Spring Boot app). Theerfore before running the tests you should run the spring boot app below locally (in a separate terminal).

## Run Spring boot app

```
./gradlew bootRun
```

## Run cucumber tests

```
./gradlew runTests
```


