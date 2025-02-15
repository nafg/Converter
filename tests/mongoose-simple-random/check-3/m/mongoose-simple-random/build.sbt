organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-d0291f"
scalaVersion := "3.1.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-a7a33e",
  "org.scalablytyped" %%% "node" % "0.0-unknown-9c8452",
  "org.scalablytyped" %%% "std" % "0.0-unknown-050be4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
