# springboot

Just some initial experiments (weather data API) creating and deploying a Spring Boot appliction docker image.

### Run
mvn package && java -jar target/gs-spring-boot-0.1.0.jar

### Create docker image
docker build -t target/weather .

### Manually copy image to location:

Save image: docker save -o my_weather_image target/weather

Copy saved docker image to "prod": scp target/my_weather_image root@yr.langehaug.net:/weather

Log into the Digital Ocean docker droplet and run the docker image

