# sanity-scan

## Prerequisite
- java 11

## Usage
```
curl --location --request POST 'http://localhost:8080/user/insert' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "lior",
    "password": "Aa123456!",
    "email": "koko@domain.com",
    "info": "something funny"
    
}'

curl --location --request GET 'http://localhost:8080/user/get/firstName/byEmail/koko@domain' \
--header 'Content-Type: application/json' \
--data-raw ''

```

## Swagger UI

- URI: http://localhost:8080/swagger-ui/index.html
- path location: /src/resources/swagger/sanity-scan-swagger.json

## Maintenance
- generate a swagger file for each API change and store it under swagger path location 

