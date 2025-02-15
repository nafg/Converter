organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-6ad001"
scalaVersion := "3.1.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "0.0-unknown-c816ae",
  "org.scalablytyped" %%% "vue" % "2.5.13-f71ef6",
  "org.scalablytyped" %%% "webpack-env" % "1.13-89b633")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
