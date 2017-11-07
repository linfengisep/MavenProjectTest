1.to use Maven, please configure the path first
export M2_HOME=/Users/linfengwang/Applications/apache-maven-3.5.0
export PATH=$PATH:$M2_HOME/bin

2.about POM.xml
if you want to 'add a jar file', please add a dependency in POM
if you want to 'pass the argument' to the main function, please configure them in the POM
if you want to 'define a mainclass', do it in the POM file

3.for executing the project , just using:-->mvn exec:java
(because you have already cofigured everything in the POM file, do not need mention the class name which should be executed.)

4.throw Exception or SQLException, please write more specific inside, the more general Exception outside.
