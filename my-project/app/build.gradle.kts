// 1. Typ des Subprojects durch Plugin(s) definieren
plugins {
    id("my.java-application")
}

// 2. Abhängigkeiten zu anderen Subprojects und Komponenten definieren
dependencies {
    implementation(project(":business-logic"))
}

// 3. Details über Extension konfigurieren
application {
    mainClass.set("myproject.App")
}