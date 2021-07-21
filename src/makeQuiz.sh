# !/bin/bash

if [ $# -eq 1 ]; then
    antlr4-build
    java Quiz.quizMain ../examples/$1
    javac output.java
else
    antlr4-build
    java Quiz.quizMain ../examples/$1 $2
    javac $2.java
fi

