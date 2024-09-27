# Football Tournament Application - Metamodel

## Overview
This repository contains the metamodel and generated code for the Football Tournament Application (FTA) used to manage and configure football tournaments. The project follows a Model-Driven Software Engineering (MDSE) approach and includes the following:

- **Metamodel**: Defined in Ecore to represent teams, players, matches, tournaments, tournament formats, and other key entities.
- **Generated Code**: Java code automatically generated from the metamodel using Eclipse EMF.
- **Model Instances**: Example configurations of the FTA for specific products of the software product line (SPL).
- **Constraints & Derived Features**: Includes non-trivial constraints and derived features, such as team size constraints and total goals derived from players' statistics.

### Domain Model
The following diagram illustrates the domain model, which captures the structure of the Football Tournament Application.

![Domain Model](./images/fta_domain_model.png)

## Repository Structure
- **model/**: Contains the Ecore model files and corresponding generated code and example model instances showing different configurations of the FTA.
- **src-gen/**: Java source generated files, including manual code additions for constraints and derived features.
- **tests/**: Unit tests to validate constraints and derived features.
- **README.md**: This documentation file.

## Running the Project
1. **Set up**: Import the Eclipse project and ensure all dependencies (EMF, Ecore) are correctly configured.
2. **Java Code Generation**: Use the Ecore model to generate Java code.
3. **Run Unit Tests**: Tests are included to check constraints (like team size) and derived features (like total goals).

### Test Results
The following image shows the test results after running the unit tests to validate the constraints and derived features.

![Test Results](./images/testresults.png)

