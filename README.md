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


## Second scan
We created branch: master-second-scan for comparison purposes
1. delete sensitive parameter - delete "firstName" from User class. Impact APIs
   1. /user/insert
   2. /user/create/password
   3. /user/updateMe
2. Non-sensitive parameter - add "height" to User class. Impact APIs
   1. /user/insert
   2. /user/create/password
   3. /user/updateMe
3. change sensitive parameter - rename "email" to "liame" (in User class). Impact APIs
   1. /user/insert
   2. /user/create/password
   3. /user/updateMe
4. fix risk - fix "privacy violation" - UserController, source node - password. Impact API
   1. /user/create/password
5. add risk - SQL injection. Impact API:
   1. /user/update/name
6. change path - from /user/update to /user/updateMe 
7. delete API - delete users/findAll

## Swagger UI

- URI: http://localhost:8080/swagger-ui/index.html
- path location: /src/resources/swagger/sanity-scan-swagger.json

## Maintenance
- generate a swagger file for each API change and store it under swagger path location 

