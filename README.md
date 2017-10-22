# Meridian
- A RESTful news scraper that takes in articles from RSS feeds of major news sources and returns the summary and location of the stories.
- Uses CLAVIN geotagger to parse each articles.
- Java project built using Spring Boot/Gradle
- Originally titled 'WhereThingsHappened', a React-based project with Java backend that used Mapbox map to pin where the news stories happened.
- Closing project until better Geoparsing solution can be found - current method too slow for real-time parsing.

### Run:
- Install [CLAVIN] (https://clavin.bericotechnologies.com/clavin-core/tutorials/installation.html) is installed in the root directory
- Build with Gradle at the root directory: ```build gradle```
- Allocate at least 1gb of Java heap space by running with the command ``` java -jar -Xmx1g build/libs/gs-spring-boot-0.1.0.jar ``` in the command line.

### Todo:
- Frontend
-- for now, instead of the React frontend, have a simple form input/output where the users could put in a link of a news article and return its location. Could be expanded into a Chrome extension that would automatically track the location of articles that the users come across and pin it on an onscreen minimap.
- Still uses Firebase wrapper; will be transitioning to AWS for further cloud application development.
