# Football Tournament Application - Metamodel

## Overview
This repository contains the metamodel and generated code for the Football Tournament Application (FTA) used to manage and configure football tournaments. The project follows a Model-Driven Software Engineering (MDSE) approach and includes the following:
Metamodel: Defined in Ecore to represent teams, players, matches, tournaments, tournament formats, and other key entities.
- Generated Code: Java code automatically generated from the metamodel using Eclipse EMF.
- Model Instances: Example configurations of the FTA for specific products of the software product line (SPL).
- Constraints & Derived Features: Includes non-trivial constraints and derived features, such as team size constraints and total goals derived from players' statistics.

## Repository Structure
- model/: Contains the Ecore model files and corresponding generated code.
- src/: Java source files, including manual code additions for constraints and derived features.
- tests/: Unit tests to validate constraints and derived features.
- README.md: This documentation file.
- example_instances/: Example model instances showing different configurations of the FTA.


## Running the Project
1. Set up: Import the Eclipse project and ensure all dependencies (EMF, Ecore) are correctly configured.
2. Java Code Generation: Use the Ecore model to generate Java code.
3. Run Unit Tests: Tests are included to check constraints (like team size) and derived features (like total goals).