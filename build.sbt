import com.ringohub.sbt.StrictWarningPlugin.scalaCompileOptions

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.ringohub",
      version      := "0.1.0",
      scalacOptions := scalaCompileOptions
    )),
    name := "Hello"
  )
