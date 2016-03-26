import sbt.Keys._
import sbt._
import sbt.plugins.JvmPlugin

object ScalaStandardPlugin extends AutoPlugin {
  override def requires = JvmPlugin
  override def trigger: PluginTrigger = allRequirements

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    scalaVersion := "2.11.8",
    resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases",
    resolvers += Resolver.sonatypeRepo("public"),
    scalacOptions := Seq("-deprecation", "-unchecked", "-encoding", "utf8", "-Xlint"),
    javacOptions in(Compile, compile) ++= Seq("-encoding", "utf8")
  )


}