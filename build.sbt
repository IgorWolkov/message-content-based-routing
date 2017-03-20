name := "message-content-based-routing"

version := "1.0"

scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Sonatype Releases"             at "http://oss.sonatype.org/content/repositories/releases",
  "Maven Central Server"          at "http://repo1.maven.org/maven2",
  "TypeSafe Repository Releases"  at "http://repo.typesafe.com/typesafe/releases/",
  "TypeSafe Repository Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
)

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "io.argonaut"   %% "argonaut"   % "6.1",
  "org.scalatest" %% "scalatest"  % "3.0.1" % "test"
)

