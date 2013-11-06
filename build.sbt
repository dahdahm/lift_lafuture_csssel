name := "starter"

version := "0.2"

organization := "com.fmpwizard"

scalaVersion := "2.10.3"

sbtVersion := "0.13.0"

seq(webSettings :_*)

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= {
val liftVersion = "2.5-RC1"
  Seq(
  "net.liftweb"       %% "lift-webkit"    % liftVersion       % "compile",
  "net.liftmodules"   %% "fobo"           % (liftVersion+"-0.9.2-SNAPSHOT"),
  "org.eclipse.jetty" % "jetty-webapp"    % "8.0.1.v20110908" % "container",
  "ch.qos.logback"    % "logback-classic" % "0.9.26"
  )
}



// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"


