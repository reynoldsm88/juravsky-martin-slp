import sbt.Keys._
import sbt._

object Dependencies {

  val slf4jVersion = "1.7.20"
  val logbackVersion = "1.2.3"
  val scalaTestVersion = "3.0.5"
  
  val slf4j = Seq( "org.slf4j" % "slf4j-api" % slf4jVersion )

  val logback = Seq( "ch.qos.logback" % "logback-classic" % logbackVersion )

  val scalaTest = Seq( "org.scalatest" %% "scalatest" % scalaTestVersion % "test" )

}
