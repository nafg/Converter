organization := "org.scalablytyped"
name := "angular-agility"
version := "0.0-unknown-19c1c8"
scalaVersion := "3.0.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.6-28c7c4",
  "org.scalablytyped" %%% "std" % "0.0-unknown-73ee2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
