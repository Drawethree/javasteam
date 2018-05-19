

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "javasteam.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-example",
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies += "com.github.l7ssha" % "javasteam" % "1.5.5-PRE"
  )
