Maven project to run static analysis tools
==========================================

Provides configuration for the following static analysis tools:
- PMD
- CheckStyle
- FindBugs
You can run these tools using the maven command line
```
mvn clean install checkstyle:checkstyle findbugs:findbugs pmd:pmd
```
