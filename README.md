# React-MySQL-Spring-Docker-demo
A demo project by creating a small library app with react as front end, with spring boot as backend and for the database MYSQL. All running as containers in docker/podman


## Local variables for running the project.
You must have 2 files for local development

And .env file with the following fields

```
MYSQL_ROOT_PASSWORD=
MYSQL_DATABASE=reactlibrarydatabase
MYSQL_USER=
MYSQL_PASSWORD=
TZ=UTC
```

And a file .env.properties that must be a copy of the content of the .env file


## How to run the project
1. Open an terminal pointing to the root folder of the repo
2. Run the following command to trigger the docker compose
    ```
    podman compose --file docker-compose.yml up --build
    ```

    In case of using docker use the following command

    ```
    docker-compose --file docker-compose.yml up --build
    ```