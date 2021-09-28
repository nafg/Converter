organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-2d9dd4"
scalaVersion := "3.0.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "react" % "0.0-unknown-fafbf1",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-1f612f",
  "org.scalablytyped" %%% "std" % "0.0-unknown-5d365e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
