# sanity-scan

# load test branch
This branch includes 80,005 risks
and 812 apis.

Lines: 2483
LOC java: 1260

### script folder
generate-java-controller.py - script to generate more apis and risks

## Prerequisite
- java 11

## Usage
### Example 1
Request
```
curl --location --request POST 'http://localhost:8080/user/insert' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "lior",
    "password": "Aa123456!",
    "email": "koko@domain.com",
    "info": "something funny"
    
}'
```
### Example 2
Request
```
curl --location --request GET 'http://localhost:8080/user/get/firstName/byEmail/koko@domain' \
--header 'Content-Type: application/json' \
--data-raw ''
```

### Example 3
Request
```
curl --location --request GET 'http://127.0.0.1:8080/country/get/byId/5'
```
Response
```
{
    "id": 5,
    "countryName": "",
    "definition": "A country is a distinct part of the world",
    "a3": "",
    "phoneCode": "",
    "displayName": "",
    "gmtOffset": "",
    "governmentForm": "DEMOCRACY",
    "a2": null
}
```


## we have 2 option to generate openapi/swagger file
### first option Swagger UI

- URI: http://localhost:8080/swagger-ui/index.html
- we can change swagger/openapi version in src/main/java/com/sanity/scan/config/SwaggerConfig.java -> DocumentationType
- option: swagger 1.2 / swagger 2.0 / openapi 3.0

### second option openapi
- URI: http://localhost:8080/v3/api-docs/
- support: openapi 3.0.1
- to enable this option need to remove the src/main/java/com/sanity/scan/config/SwaggerConfig.java
- and update the pom.xml
form
```xml
<!-- swagger/openapi files -->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>3.0.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
<!--		<dependency>-->
<!--			<groupId>org.springdoc</groupId>-->
<!--			<artifactId>springdoc-openapi-ui</artifactId>-->
<!--			<version>1.6.14</version>-->
<!--		</dependency>-->
```
to
```xml
<!-- swagger/openapi files -->
<!--		<dependency>-->
<!--			<groupId>io.springfox</groupId>-->
<!--			<artifactId>springfox-swagger-ui</artifactId>-->
<!--			<version>3.0.0</version>-->
<!--		</dependency>-->
<!--		<dependency>-->
<!--			<groupId>io.springfox</groupId>-->
<!--			<artifactId>springfox-boot-starter</artifactId>-->
<!--			<version>3.0.0</version>-->
<!--		</dependency>-->

		<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.14</version>
		</dependency>
```

## Maintenance
- generate a swagger file for each API change and store it under /src/resources/swagger/




