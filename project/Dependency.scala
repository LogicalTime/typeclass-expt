import sbt._

object Dependency {

  object Version {
    val Jackson = "2.5.4"
    val Guava = "19.0"
    val Args4j = "2.32"
    val Junit = "4.12"
    val SprayJson = "1.3.2"
    val Enumeratum = "1.3.7"
    val Akka = "2.4.2"
    val Scalatest = "3.0.0-M15"


  }

  // library dependencies. (orginization name) % (project name) % (version)
  val jacksonCore = "com.fasterxml.jackson.core" % "jackson-core" % Version.Jackson
  val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % Version.Jackson
  val jacksonAnnotations = "com.fasterxml.jackson.core" % "jackson-databind" % Version.Jackson
  val jacksonScalaModule = "com.fasterxml.jackson.module" %% "jackson-module-scala" % Version.Jackson
  val guava = "com.google.guava" % "guava" % Version.Guava
  val args4j = "args4j" % "args4j" % Version.Args4j
  val junit = "junit" % "junit" % Version.Junit % "test"
  val sprayJson = "io.spray" %% "spray-json" % Version.SprayJson
  val enumeratum = "com.beachape" %% "enumeratum" % Version.Enumeratum
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.Akka
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % Version.Akka
  val akkaHttpCore = "com.typesafe.akka" %% "akka-http-core" % Version.Akka
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % Version.Akka
  val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % Version.Akka

  val scalactic =  "org.scalactic" %% "scalactic" % Version.Scalatest
  val scalatest = "org.scalatest" %% "scalatest" % Version.Scalatest

  val allAkka = Seq(akkaActor, akkaStream, akkaHttpCore)
  val allJackson = Seq(jacksonCore, jacksonDatabind, jacksonAnnotations)
}