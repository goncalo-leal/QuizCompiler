#!/bin/bash

if [ $# -eq 0 ]; then
    java output
else
    java $1
fi