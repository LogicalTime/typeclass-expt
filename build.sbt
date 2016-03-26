import Dependency._
import sbt.Keys._


lazy val root = project in file(".")

def commonSettings = Seq(
  name := "anagrammer-scala",
  version := "0.1.0",
  scalaVersion := "2.11.8",
  description := "",
  javacOptions in(Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "utf8"),
  libraryDependencies ++= Seq(enumeratum, scalactic, scalatest % Test)
)

lazy val lab1 = project
  .settings(
    libraryDependencies += "joda-time" % "joda-time" % "2.1",
    libraryDependencies += "org.joda" % "joda-convert" % "1.3"
  )

lazy val lab2 = project
  .settings(
    libraryDependencies += "joda-time" % "joda-time" % "2.1",
    libraryDependencies += "org.joda" % "joda-convert" % "1.3"
  )

lazy val lab3 = project
  .settings(
    libraryDependencies += "joda-time" % "joda-time" % "2.1",
    libraryDependencies += "org.joda" % "joda-convert" % "1.3"
  )

lazy val lab4 = project
  .settings(
    libraryDependencies += "joda-time" % "joda-time" % "2.1",
    libraryDependencies += "org.joda" % "joda-convert" % "1.3"
  )