Simple Java project to run several static analysis tools
=======================================================

Provides configuration for static analysis tools:
- PMD
- CheckStyle
- FindBugs
You can run these tools using the maven command line
```
mvn clean install checkstyle:checkstyle findbugs:findbugs pmd:pmd
```
