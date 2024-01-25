#!/bin/bash

for item in *; do
    if [ -d "$item" ]; then
        cp Dockerfile $item/Dockerfile
    fi
done

