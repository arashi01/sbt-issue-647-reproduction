What is it?
-----------

This example demonstrates sbt/sbt#647 an issue affecting resolution of maven projects with nested
parent POM structure with sbt versions <= 0.13.5-M2

To reproduce the issue:
-  Run `sbt update`
-  Observe that an `sbt.ResolveException` is thrown due to inability to resolve 
   `org.jboss.shrinkwrap.descriptors#shrinkwrap-descriptors-api-base;1.0.3.Final`
-  Run `git checkout workaround; sbt update`
-  Observe that process completes successfully


