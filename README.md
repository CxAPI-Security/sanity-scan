# sanity-scan

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



## Swagger UI

- URI: http://localhost:8080/swagger-ui/index.html
- path location: /src/resources/swagger/sanity-scan-swagger.json

## Maintenance
- generate a swagger file for each API change and store it under swagger path location 

