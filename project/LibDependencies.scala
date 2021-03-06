import sbt._

private object LibDependencies {

  val compile: Seq[ModuleID] = Seq(
    "commons-io" % "commons-io" % "2.6"
  )

  val test: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest"  % "3.0.5" % "test",
    "org.pegdown"   % "pegdown"     % "1.6.0" % "test",
    "org.mockito"   % "mockito-all" % "1.10.19" % "test"
  )
}
