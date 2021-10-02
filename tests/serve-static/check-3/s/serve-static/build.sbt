organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-df5088"
scalaVersion := "3.0.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-7e61f3",
  "org.scalablytyped" %%% "mime" % "2.0-9e58bc",
  "org.scalablytyped" %%% "std" % "0.0-unknown-0f4ab1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
