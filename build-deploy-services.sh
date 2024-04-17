#!/bin/bash

for item in *; do
    if [ -d "$item" ]; then
        cd "$item"

        docker build -t "${item}:latest" .
        docker_status=$?

        if [ $docker_status -ne 0 ]; then
            echo "Docker command failed in $item !"
            exit 1
        fi

        cd ../
    fi
done

#sleep 5

#docker-compose -f helper-services.yml up -d

sleep 60
docker-compose up -d
