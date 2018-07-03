plugins {
    java
    scala
}

group = "io.github.alexbogovich"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile ("org.scala-lang:scala-library:2.11.12")
    testCompile("org.scalatest:scalatest_2.11:3.0.5")
    testCompile ("junit:junit:4.12")
}
