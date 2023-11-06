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

In the first line it is given that we have 6 islands and 6 bidirectional paths between them.
The next lines gives the connections between the islands and the last line gives which island is the
starting point and which island should be included to the tour for this case.

<img width="916" alt="Screenshot 2023-11-06 at 23 12 48" src="https://github.com/sarparslan/Tour-Guide-App/assets/96438389/7e8b285c-2287-4647-85da-2963b7dc96ff">


## Output Format

In the output, program prints K space separated integers denoting the path which the tour starts from
island X and includes island Y. There can be multiple paths. Program prints the lexicographically smallest
one.

<img width="932" alt="Screenshot 2023-11-06 at 23 13 49" src="https://github.com/sarparslan/Tour-Guide-App/assets/96438389/e6a86782-07e9-4bf5-911a-c7e2bb09ab52">
