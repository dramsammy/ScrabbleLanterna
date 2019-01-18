#!/bin/bash
resize -s 40 90
javac -cp lanterna.jar:. Game.java
java -cp lanterna.jar:. Game
