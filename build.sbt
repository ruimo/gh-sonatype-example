import ReleaseTransformations._

val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "gh-sonatype-example",
    homepage := Some(url("https://github.com/ruimo/gh-sonatype-example")),
    scalaVersion := scala3Version,
    organization := "com.ruimo",
    licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer(
        "ruimo",
        "Shisei Hanai",
        "ruimo.uno@gmail.com",
        url("https://github.com/ruimo")
      )
    ),
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
    releaseProcess -= publishArtifacts
  )
