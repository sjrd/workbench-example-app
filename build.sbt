enablePlugins(ScalaJSPlugin /*, WorkbenchPlugin*/)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.0.0",
  "com.lihaoyi" %%% "scalatags" % "0.9.1"
)
