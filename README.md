
# train-ticket-microservices

## Dependencies

The only dependencies for running the project are Docker and Docker Compose. It was tested with the following versions:

```yaml
Docker Desktop: 4.29.0 (145265)
Docker Engine: 26.0.0
Docker Compose: v2.26.1-desktop.1
```

Lower versions should work too.

---

## Start system

### Start basic system

To start the system with minimum configuration, run the following command:

```sh
docker compose --build -d
```

This command will pull and build all the necessary images required for the system.

### Start with telemetry

By default, the system is not started with telemetry. To run it with telemetry, use the following command:

```sh
docker compose -f ./docker-compose.yml -f ./docker-compose.override.telemetry.yml up --build -d
```

This command includes telemetry to the base definition, ensuring that any changes made to the base configuration are reflected here as well.

---

## Additional Instructions

### 1. **Make the build-deploy script executable and run it:**

If you have the `build-deploy-services.sh` script, use the following commands to execute the script:

```sh
chmod +x build-deploy-services.sh
./build-deploy-services.sh
```

This script will:
- Build Docker images for each subdirectory.
- Run `docker-compose up -d` to start the services.

---

### 2. **Manually bring up individual services:**

If you want to start specific services, use the following commands:

- **Consul Service**:

    ```sh
    docker-compose -f consul_compose.yml up -d
    ```

- **Telemetry Service**:

    ```sh
    docker-compose -f docker-compose.override.telemetry.yml up -d
    ```

- **MySQL Database**:

    ```sh
    docker-compose -f mysql-compose.yml up -d
    ```

- **RabbitMQ Service**:

    ```sh
    docker-compose -f rabbit-compose.yml up -d
    ```

---

### 3. **Check running services:**

To check whether your services are running, use the following command:

```sh
docker ps
```

---

### 4. **Stop all running services:**

To stop the services, run:

```sh
docker-compose down
```
