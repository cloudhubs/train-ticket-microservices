# train-ticket-microservices

## Dependencies

The only dependency for running the project is docker and docker compose, it was tested with the following dependencies:
```yaml
Docker Desktop: 4.29.0 (145265)
Docker Engine: 26.0.0
Docker Compose: v2.26.1-desktop.1
```

Lower versions should work too

## Start system

### Start basic system

In order to start the system with minimum configuration needs to run the following command:

```sh
docker compose --build -d
```

This command is going to pull and build all the necessary images needed for the system.

### Start with telemetry

By default the system is not started with telemetry, in order to run it with telemetry needs to run the following command:

```sh
docker compose -f ./docker-compose.yml -f ./docker-compose.override.telemetry.yml up --build -d
```

This command just include the telemetry to the base definition, so any change made to the base configuration is being made here too.
