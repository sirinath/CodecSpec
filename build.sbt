import sbt.Keys._

lazy val CodeSpec = (project in file(".")).
  settings(
    name := "CodecSpec",
    organization := "com.sakrio",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := Dependencies.scalaVersion,
    autoCompilerPlugins := true,
    libraryDependencies ++= Dependencies.dependencies,
    resolvers ++= Dependencies.resolvers
  )