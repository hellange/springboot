# springboot

Just some initial experiments (weather data API) creating and deploying a Spring Boot appliction docker image.

### Run locally

`mvn package && java -jar target/gs-spring-boot-0.1.0.jar`

### Create docker image
`docker build -t weather .`

### Run docker locally with docker
`docker run -t -p 8080:8080 weather`

### Run docker locally using docker-compose (if not using docker directly)
`docker-compose up --build -d`
Will also restart and rebuild the image if the .jar has changed



### Manually copy image to "prod" location (using just scp):

Save image: `docker save -o target/my_weather_image weather`

Copy saved docker image to "prod" machine: `scp target/my_weather_image root@yr.langehaug.net:/weather`

Log into "prod" machine, and cd into directory where the copied file is located.

Load the copied image into docker: docker load -i weather`

Start in 'prod' machine: docker run -t -p 80:8080 weather`

