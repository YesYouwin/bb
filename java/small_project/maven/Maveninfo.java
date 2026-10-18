/*

cd java/small_project/maven

mvn org.apache.maven.plugins:maven-archetype-plugin:3.4.1:generate "-DgroupId=com.buresu" "-DartifactId=Euphoria" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false"

This generates a folder named "Euphoria"
A file tree like main\java\com\buresu AND test\java\com\buresu
Alongside a pom.xml to add your dependencies into. This FILE IS VERY IMPORTANT


Then there are commands like:

mvn compile                     Compiles the Code into a class file
mvn clean compile               Deletes the previous compilation and makes a brand new one
mvn clean package               Creates the Package/.jar file


mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java "-Dexec.mainClass=com.buresu.Bot"

*/