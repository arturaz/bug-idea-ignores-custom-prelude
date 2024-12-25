ThisBuild / scalaVersion := "3.6.2"

lazy val myPrelude = project.in(file("myPrelude"))

lazy val root = project.in(file("."))
  .dependsOn(myPrelude)
  .settings(
    scalacOptions ++= Seq(
      "-Yimports:java.lang,scala,scala.Predef,my_extensions"
    )
  )