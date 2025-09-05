# `Running as container`

This is the command for running only the container with the front-end

```
podman build -t my-backend-app . 

podman run --name my-backend-app -p 8080:8080 my-backend-app:latest

```


## `Running db and backend`
```
podman compose down && podman compose --file docker-compose.yml up --build -d
```