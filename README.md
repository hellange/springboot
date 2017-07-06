# springboot

Just some initial experiments with creating a docker image with a Spring Boot appliction.

Run:
mvn package && java -jar target/gs-spring-boot-0.1.0.jar

Docker:
Create image: docker built -t weather .
Save image: docker save -o my_weather_image weather
Copy saved docker image to Digital Ocean: ssh my_weather_image root@138.197.118.227:/weather
Log into the Digital Ocean docker droplet and run the docker image

