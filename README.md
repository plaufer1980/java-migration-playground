java-migration-playground
=========================

#### What's the setup?
The project consists of two libraries. They have been created like this (Maven is used as a build tool):  
`mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.github.plaufer1980.java.migration.playground -DartifactId=j6-lib`  
`mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.github.plaufer1980.java.migration.playground -DartifactId=j7-lib`  

And two apps that depend on these libraries:  
`mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.github.plaufer1980.java.migration.playground -DartifactId=j6-app`  
`mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.github.plaufer1980.java.migration.playground -DartifactId=j7-app`  

Everything is tied together by a multi-module POM so it can be built conveniently:  
`mvn clean install`  

As the names suggest there is one library with JDK 1.6 compatible source (_j6-lib_) and one that uses JDK 1.7 features (_j7-lib_). Same is true for the apps.
Every module uses the _maven-compiler-plugin_ to specify the required Java source and target versions.

Single apps can be built using Maven's project list support:  
`mvn clean install -am -pl j7-app`  
`mvn clean install -am -pl j6-app`  

Additionally, the _maven-shade-plugin_ is used to obtain some executable jars for the _j6-app_ and _j7-app_ modules which can be executed like this (after a successful build):  
`java -jar j6-app/target/j6-app-1.0-SNAPSHOT.jar`  
`java -jar j7-app/target/j7-app-1.0-SNAPSHOT.jar`  

#### Observations 
* Interestingly, building the _j6-app_ (which is configured to be built with JDK 1.6 target) doesn't raise any warnings or errors regarding the JDK 1.7 sources from _j7-lib_.
* Running the _j6-app_ with JDK 1.7 doesn't produce any issues.
* Running the _j6-app_ with JDK 1.6 produces the following error:  
`Exception in thread "main" java.lang.UnsupportedClassVersionError: com/github/plaufer1980/java/migration/playground/Java7Foo : Unsupported major.minor version 51.0`


