# Gradle 7 Sample Project

## Gradle Projects

- Main project: [my-project](my-project)
- Project for build configuration and logic: [my-build-logic](my-other-project)
- Example of another project (empty): [my-other-project](my-build-logic)

## Gradle files in the main project

Settings file:

- [settings.gradle.kts](my-project/settings.gradle.kts)

Build files:

- [data-model/build.gradle.kts](my-project/data-model/build.gradle.kts)
- [business-logic/build.gradle.kts](my-project/business-logic/build.gradle.kts)
- [app/build.gradle.kts](my-project/app/build.gradle.kts)

## Gradle files in the build logic project

Settings file:

- [settings.gradle.kts](my-build-logic/settings.gradle.kts)

Build file:

- [java-plugins/build.gradle.kts](my-build-logic/java-plugins/build.gradle.kts)

Convention plugins:

- [java-plugins/src/main/kotlin/my.java-library.gradle.kts](my-build-logic/java-plugins/src/main/kotlin/my.java-library.gradle.kts)
- [java-plugins/src/main/kotlin/my.java-application.gradle.kts](my-build-logic/java-plugins/src/main/kotlin/my.java-application.gradle.kts)

## Executing Gradle builds

Some tasks to run in [my-project](my-project) (add `--scan` to produce a build scan):

- Run the app: `gradle :app:run`
- Run all tests: `gradle check`
- Compile all code: `gradle assemble`

Build scan to explore the build: [https://scans.gradle.com/s/shjf5ydjkxss6](https://scans.gradle.com/s/shjf5ydjkxss6)