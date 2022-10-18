resolvers ++= Seq(
  Resolver.bintrayIvyRepo("typesafe", "sbt-plugins"),
  "Tatami Releases" at "https://raw.github.com/cchantep/tatami/master/releases"
)

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")

addSbtPlugin("cchantep" % "sbt-scaladoc-compiler" % "0.3")

addSbtPlugin("cchantep" % "sbt-hl-compiler" % "0.8")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.5")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.10.2")
