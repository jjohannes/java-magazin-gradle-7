// 1. Eindeutiger Projektname
rootProject.name = "my-project"

// 2b. Orte an denen Gradle nach Plugins suchen soll
pluginManagement {
    // Repositories mit veröffentlichten Plugins
    repositories {
        gradlePluginPortal()
        google()
    }
    // Andere Gradle Builds mit eigenen (Convention-)Plugins
    includeBuild("../my-build-logic")
}

// 2a. Orte an denen Gradle nach anderen Komponenten suchen soll
dependencyResolutionManagement {
    // Repositories mit veröffentlichten Komponenten
    repositories {
        mavenCentral()
        google()
    }
    // Andere Gradle Builds die Komponenten exportieren
    includeBuild("../my-other-project")
}

// 3. Struktur des Projekts (subprojects)
include("app")
include("business-logic")
include("data-model")
