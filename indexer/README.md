# CDA API INDEXER
Spring boot command line runer app to migrate the CDA data entities to PostgreSQL

## Requirements
  - PostgreSQL 5+
  - Java 8+
  - Maven 3+

## Installation
## Installation
1. Clone this repo
```console
git clone https://github.com/mpi2/cda_api.git
cd web
```
2. Edit the [application.properties_example](https://github.com/mpi2/cda_api/blob/master/indexer/src/main/resources/application.properties_example) file and rename it to application.properties
3. Run the spring boot app
```console
mvn spring-boot:run
```

## Development Environment Setup
  1. Download and install PostgreSQL
  2. Import this project to your favorite IDE (we use IntelliJ) as a Maven project
  3. Edit the application.properties_example file with your database info and credentials
  4. Change the [application.properties_example](https://github.com/mpi2/cda_api/blob/master/indexer/src/main/resources/application.properties_example) file name to application.properties
  5. Do your awesome coding
  

