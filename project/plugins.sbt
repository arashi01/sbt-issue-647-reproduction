import sbt._
import sbt.Keys._

resolvers += Resolver.url("Typesafe repository",
   new java.net.URL("http://typesafe.artifactoryonline.com/typesafe/ivy-releases/"
   ))(Resolver.defaultIvyPatterns)

