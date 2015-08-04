name := "play-angular2"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.webjars.npm" % "angular2" % "2.0.0-beta.11" % Provided,
  "org.webjars.npm" % "rxjs" % "5.0.0-beta.2" % Provided,
  "org.webjars.npm" % "es6-shim" % "0.35.0" % Provided,
  "org.webjars.npm" % "systemjs" % "0.19.24" % Provided,
  "org.webjars.npm" % "reflect-metadata" % "0.1.2" % Provided,
  "org.webjars.npm" % "zone.js" % "0.6.4" % Provided
)

projectFile  := (baseDirectory.value / "tsconfig.json")

routesGenerator := StaticRoutesGenerator

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

resolveFromWebjarsNodeModulesDir := true
