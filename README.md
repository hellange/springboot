# springboot

Just some initial experiments with creating a docker image with a Spring Boot appliction.

### Run
mvn package && java -jar target/gs-spring-boot-0.1.0.jar

### Create docker image
docker build -t weather .

### Manually copy image to location:

Save image: docker save -o my_weather_image weather

Copy saved docker image to "prod": scp my_weather_image root@yr.langehaug.net:/weather

Log into the Digital Ocean docker droplet and run the docker image

