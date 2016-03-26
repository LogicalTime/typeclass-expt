import Dependency._
import sbt.Keys._

name := "anagrammer-scala"
version := "0.1.0"
scalaVersion := "2.11.8"
description := ""

lazy val root = project in file(".")

lazy val expt1 = project
  .settings(
    javacOptions in(Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "utf8"),
    libraryDependencies ++= allAkka,
    libraryDependencies ++= Seq(enumeratum, scalactic, scalatest % Test)
  )