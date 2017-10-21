# Meridian
- Java project built using Spring Boot/Gradle
- Originally titled 'WhereThingsHappened', a React-based project with Java backend that used Mapbox map to pin where the news stories happened.
- Uses CLAVIN geotagger for tagging cities/countries of the news stories

### Run:
- Install [CLAVIN] (https://clavin.bericotechnologies.com/clavin-core/tutorials/installation.html) is installed in the root directory
- Build with Gradle at the root directory: ```build gradle```
- Allocate at least 1gb of Java heap space by running with the command ``` java -jar -Xmx1g build/libs/gs-spring-boot-0.1.0.jar ``` in the command line.

### Todo:
- Still uses Firebase wrapper; will be transitioning to AWS
