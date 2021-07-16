import io.gatling.build.license._

import sbt._
import sbt.Keys._
import de.heikoseeberger.sbtheader.HeaderPlugin.autoImport._

object BuildSettings {

  lazy val basicSettings = Seq(
    organization := "io.gatling.highcharts",
    headerLicense := GatlingHighChartsLicense,
    publishTo := Some(Resolver.file("local-ivy", file("$HOME/.ivy2/local/"))),
    licenses := Seq("Gatling Highcharts" -> url("https://raw.githubusercontent.com/gatling/gatling-highcharts/master/LICENSE"))
  )
}
