# React-MySQL-Spring-Docker-demo
A demo project by creating a small library app with react as front end, with spring boot as backend and for the database MYSQL. All running as containers in docker/podman


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