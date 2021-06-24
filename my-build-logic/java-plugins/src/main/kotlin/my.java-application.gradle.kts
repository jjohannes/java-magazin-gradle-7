plugins {
    id("application")
}

// Eigene Konventionen über Extensions definieren
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

// Eigenen Konventionen über direkte Task-Konfiguration
tasks.test {
    useJUnitPlatform() // Tests mit JUnit 5 ausführen
}