/**
 * Created by sirin_000 on 09/06/2015.
 */

import sbt._

object Dependencies {
  // Versions
  lazy val scalaVersion = "2.11.7"

  // Libraries
  lazy val scodecBits = "org.scodec" %% "scodec-bits" % "1.0.7"
  lazy val scodecCore = "org.scodec" %% "scodec-core" % "1.8.0"
  lazy val scodecScalaz = "org.scodec" %% "scodec-scalaz" % "1.1.0"
  lazy val scodecStream = "org.scodec" %% "scodec-stream" % "0.10.0"
  lazy val scodecProtocols = "org.scodec" %% "scodec-protocols" % "0.7.0"
  lazy val scodecSpire = "org.scodec" %% "scodec-spire" % "0.2.0"
  lazy val scalaz =  "org.scalaz" %% "scalaz-core" % "7.1.3"
  lazy val shapeless =  "com.chuusai" %% "shapeless" % "2.2.3"
  lazy val spire = "org.spire-math" %% "spire" % "0.10.1"

  // Projects
  lazy val dependencies = Seq(scodecBits, scodecCore, scodecScalaz, scodecStream, scodecProtocols, scodecSpire, scalaz, shapeless, spire)

  lazy val resolvers = Seq(
    DefaultMavenRepository,
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots"),
    Resolver.sonatypeRepo("releases"),
    Resolver.typesafeRepo("releases"),
    Resolver.typesafeRepo("snapshots"),
    Resolver.sbtPluginRepo("releases"),
    Resolver.sbtPluginRepo("snapshots"),
    "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"
  )
}