# Tour-Guide-App
# Coastal Island Ship Tour Organizer

This Java project is a tour guide tool for organizing ship tours in a coastal city. The tool helps plan a ship tour that starts from one island (X), includes another specific island (Y), and returns to the starting point, exploring the coastal islands and their connections.

## Introduction

As a tour guide in a coastal city, you need to organize ship tours for your guests. There are N islands around the city, and your task is to plan a ship tour that starts from one island (X), includes a specific island (Y), and returns to the starting point, ensuring your guests have a memorable experience exploring the coastal beauty.

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

In the input, the first line contains two space-separated integers: N (number of islands) and M (number of connections).

Next, M lines contain two space-separated integers each: U and V, indicating bidirectional connections between islands U and V.

Finally, the last line contains two space-separated integers: X (starting island) and Y (island to include in the tour).

## Output Format

The output includes the following:

1. The sequence of islands visited during the ship tour, starting and ending at the same island.

2. The total number of islands visited during the tour.

The program will also display additional tour details to help guide your guests.
