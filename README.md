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
The multi-module POM uses the _maven-compiler-plugin_ to build everything with JDK 1.7 source and target versions and the JDK 1.6 modules override this with their own _maven-compiler-plugin_ configuration.


Single apps can be built using Maven's project list support:  
`mvn clean install -am -pl j7-app`  
`mvn clean install -am -pl j6-app`  


#### Observations 
Interestingly, building the _j6-app_ (which is configured to be built with JDK 1.6 target) doesn't raise any warnings or errors regarding the JDK 1.7 sources from _j7-lib_.


