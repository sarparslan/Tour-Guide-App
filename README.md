# Tour-Guide-App
# Coastal Island Ship Tour Organizer

This Java project is a tour guide tool for organizing ship tours in a coastal city. The tool helps plan a ship tour that starts from one island (X), includes another specific island (Y), and returns to the starting point, exploring the coastal islands and their connections.

## Introduction

Welcome to the Coastal City Ship Tour Organizer program! This program is designed to help tour guides organize ship tours for their guests in a coastal city. The tour will start from a specified island (Island X), include another island (Island Y), and return to the beginning point at the end of the tour.

## Problem Statement

As a tour guide in a coastal city, you need to organize a ship tour that includes N islands around the city and M undirected paths between the islands. The ship tour should start from Island X, include Island Y, and return to the beginning point at the end of the tour.

## Features

- Efficient ship tour planning for coastal islands.
- Optimization of routes to include specific islands (X and Y).
- Support for exploring coastal islands and returning to the starting point.
- Clear and extensible Java codebase.

## Getting Started

1. Clone this repository to your local machine.

2. Compile and run the Java program using your preferred Java development environment.

3. Follow the prompts to input the necessary parameters and plan the ship tour.

## Usage

To use the Coastal Island Ship Tour Organizer, follow these steps:

1. Run the Java program.

2. Provide input parameters such as the number of islands (N), number of connections (M), island connections, starting island (X), and the island to include in the tour (Y).

3. The program will calculate and display the optimized ship tour route that includes both islands X and Y and returns to the starting point.

## Input Format

In the input, the first line contains 4 space separated integers, N, M, T and C. 

N denotes the number of cities we have 

M denotes the number of connections between the N cities 

T denotes the time required by airports to change their states 

C denotes that the time for travelling one city to another. 

Next M lines contains two space separated integers each 

U and V denoting that there is a bidirectional road between city U and city V. 

Next line contains two space separated integers, X the city we start to travel and Y the city we want to reach at the end.

In the first line it is given that we have 5 cities and 5 bidirectional roads between them. For
this case, time required the airports to change their state is 3 minutes and travel through any flight
route is 5 minutes. The next lines gives the connections between the cities and the last line gives
which city is the starting point and which city is the end point for this case.

<img width="1190" alt="Screenshot 2023-11-06 at 23 07 41" src="https://github.com/sarparslan/Tour-Guide-App/assets/96438389/62c0d696-c264-4033-87fb-6b25c84f58e7">


## Output Format

In the output, the first line print an integer K, denoting the number of city you need to go through to reach city Y from the city X. 

In next line, print K space separated integers denoting the path which will take the minimum amount of time (in minutes) required by to move from city X to city Y.

 In the last line, print the total time through the path from city X to city Y. There can be
multiple paths. Print the lexicographically smallest one and then the total time for each path at the
end.

<img width="1190" alt="Screenshot 2023-11-06 at 23 07 58" src="https://github.com/sarparslan/Tour-Guide-App/assets/96438389/d9638600-eded-4769-9c61-aaa860e69787">
