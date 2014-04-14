import sbt._
import sbt.Keys._

resolvers += "JBoss repository" at "http://repository.jboss.org/nexus/content/groups/public/"

resolvers += "Project Odd repository" at "http://repository-projectodd.forge.cloudbees.com/upstream/"

libraryDependencies ++= Seq("org.jboss.shrinkwrap.descriptors" % "shrinkwrap-descriptors-api-base" % "2.0.0-alpha-3",
  "org.jboss.shrinkwrap.descriptors" % "shrinkwrap-descriptors-spi" % "2.0.0-alpha-3",
  "org.jboss.arquillian.config" % "arquillian-config-impl-base" % "1.0.3.Final")

