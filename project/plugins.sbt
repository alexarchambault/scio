addSbtPlugin("com.cavorite" % "sbt-avro" % "2.0.5")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.3")
addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.6.5")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.2")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.7.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.15")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.3")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.8.0")
addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.4.1")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.0")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.5.1")
addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.13")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.0")

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.11.4",
  "org.apache.avro" % "avro-compiler" % "1.8.2"
)

addSbtPlugin("io.get-coursier" % "sbt-lm-coursier" % "2.0.0-RC6-4+35-33d9bba5-SNAPSHOT")
addSbtPlugin("io.github.alexarchambault.sbt" % "sbt-coursier-export" % "0.0.0+3-499a7c89+20200522-1926-SNAPSHOT")
