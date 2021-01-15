# SCA-Cloud-School-Application

# A guide on the processes of running the docker container and testing the application.
Created a simple springboot project with a controller with a path variable(/welcome) that displays a string. the application runs on the default(http://localhost:8080/welcome).

# Dockerizing the application
Created a dockerfile in the project that contains the commands to build the docker image.
Built the docker image by running the docker build command in the root directory and giving the image a tag name. ($ docker build -t WelcomingApp .)
Finally running the docker image with the command ($ docker run -p 8090:8080 WelcomingApp )
Mapped the port of the host operating system - 8090 and the port inside the container - 8080, which is specified as the -p 8090:8080 argument, beacause each container is an isolated environment in itself.

The application is sucessfully running on a docker container.

# Pushing to docker hub
Created a repository on Docker hub where the image was pushed and has been saved in the Docker registry.
The Docker hub repository is located at https://hub.docker.com/repository/docker/lyndaae/sca-cloud


