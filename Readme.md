# Citi's Technology Software Development on Forage job simulation.
 ## Implementation of Loan Management System and stock market risk reporting.
 


This repository contains the Java-based solutions developed during my Citi Job simulation of Virtual internship from Forage aspart of the Technology Analyst Program, Eacch task demonstrate pracical applicaion of software 
development and machine learning in loan management and risk assessment tools as well as tools for real-time stock market monitoring, data analysis and visualization, providing practical applications of software development and data analysis in financial industry.



## Table of Contents
- [Overview](#overview)
- [Task 1: Create a Loan State Diagram](#task-1-create-a-loan-state-diagram)
- [Task 2: Write a Feature Proposal](#task-2-write-a-feature-proposal)
- [Task 3: Build a Stock Monitoring Application](#task-3-build-a-stock-monitoring-application)
- [Task 4: Visualize Live Stock Data](#task-4-visualize-live-stock-data)
- [Citi Job Simulation Program](#citi-job-simulation-program)
- [Credits](#credits)



## Overview

As part of the Citi Virtual Internship Program, I worked on several Java applications aimed to designed to improve internal tools and workflows. Each task focuses on a different aspect of these processes, with solution to solve real-world financial challenges.

## Internship Role:
As a Technology Analyst Intern at Citi , responsibilities included:

- Collaborating with cross-functional teams to understand business requirements and translate them into technical solutions.
- Developing software applications that enhance operational efficiency and improve decision-making processes.
- Conducting research on machine learning applications in finance, particularly for credit risk assessment.
- Creating diagrams and documentation to support project workflows and system designs.

The tasks included:
- Task 1. Model the loan management process with a UML state diagram.
- Task 2: Propose a machine learning-based credit risk modeling system.
- Task 3: Develop a stock monitoring tool to retrieve live stock data.
- Task 4: Enhance the stock monitoring tool with live data visualization.

# Project Tasks

## Task 1: Create a Loan State Diagram.
### Objecive
Develop a UML state diagram representing the loan management process, capturing key states and transitions from the initial loan application to loan payoff or closure.

### Description
The state diagram models the workflow of a loan's lifecycle, highlighting all possible states and transitions caused by borrower actions, lender decisions, and external factors.

### Solutions Steps:
1. **Research:** Reviewed resources on UML state diagrams and the loan management process.
2. **Identify States and Transitions:** Mapped out all possible states a loan can be in and the events causing transitions.
3. **Create the Diagram:** Used [draw.io](https://app.diagrams.net/) to create the state diagram.
4. **Review and Refine:** Ensured the diagram accurately reflects the loan workflow.

## Key States Included:
- Loan Application Submitted
- Application Under Review
- Application Approved/Rejected
- Loan Disbursed
- Repayment in Prograss
- Payment Overdue
- Loan Delinquent
- Loan Defaulted
- Loan Paid Off
- Loan Closed

### Deliverable
[Loan Management State Diagram](./Task%201-%20Loan%20State%20Diagram/Citi_LMS_state_Diagram.png)

## Task 2: Write a Feature Proposal

### Objective
Propose a machine learning-based credit risk modeling system to enhance the efficiency and accuracy of credit risk assessments in the loan approval process.

### Description
The proposal outlines the benefits of implementing a machine learning system for credit risk assessment, including automated risk scoring and decision-making. 

### Solution
#### Components of the Proposal:
1. **Executive Summary**: Highlighted the benefits of implementing a machine learning system for credit risk assessment.
2. **Data Requirements**: Identified necessary input variables such as borrower information, financial history, and loan details.
3. **Data Outputs**: Defined the expected outputs, including risk scores and automated decision recommendations.
4. **Architecture**: Explored suitable machine learning models (e.g., Logistic Regression, Random Forest, Gradient Boosting Machines) and recommended an approach.
5. **Risks and Challenges**: Addressed potential issues like data quality, model bias, regulatory compliance, and operational risks.

### Deliverable
- [Credit Risk Modeling Proposal](./Task%202-%20Write%20a%20Feature%20Proposal/CreditRiskModelingProposal.md)


## Task 3: Build a Stock Monitoring Application

### Objective 
Develop an internal tool to assist employees in monitoring the stock market in real-time using Java and an API.

### Description
The application queries the Dow Jones Industrial Average (DJIA) stock price every five seconds, stores the data in a queue, and provides real-time insights for risk management.

### Solution
#### Java Implementation 

1. **Setup Environment**: Installed Gradle and initialized a new Java application using `gradle init`.
2. **Add Dependencies**: Included the Yahoo Finance API in the `build.gradle` file.
3. **Develop Application**: Wrote a program to fetch Dow Jones Industrial Average (DJIA) stock prices every five seconds and store them in a queue.
4. **Compile and Run**: Used `gradle build` and `gradle run ` Built and executed the application.
5. **Test and Debug**: Verified that the application works correctly and handles exceptions.

### Deliverable
- [App.java](./Task%203-%20Build%20a%20Stock%20Monitoring%20Application/App.java)


## Task 4: Visualize Live Stock Data

### Objective
Enhance the stock monitoring application by adding a visual dashboard that displays live stock data as it's queried.

### Descrption
The updated application includes a JavaFX-based live-updating line graph of the DJIA stock price, providing non-technical users with a visual representation of stock performance.

### Solution
#### Java Implementation

1. **Update Dependencies**: Added JavaFX dependencies to the `build.gradle` file.
2. **Modify Application**: Updated `App.java` to display a live-updating line graph of the DJIA stock price using JavaFX.
3. **Implement Visualization**: Integrated a line chart that updates every time new stock data is fetched.
4. **Compile and Run**: Rebuilt and ran the application to test the visualization feature.

### Deliverable
- [App.java with Visualization](./Task%204-%20Visualize%20live%20Stock%20Data/App.java)

## Citi Job Simulation Program

The Citi Job Simulation Program, offered through Forage, provides participants with a virtual experience of working at Citi. This program allows individuals to engage in tasks that mirror real-life scenarios faced by Citi professionals, helping them develop practical skills and gain insights into the financial industry.

For more information, visit the [Citi Job Simulations on Forage](https://www.theforage.com/show-firm-programs/8eNRcRqBZM9HLvwGw/Citi).


## Credits

- **Supervisor**: Team Lead at Citi's Technology Software Development team.
- **Resources**:
  - [UML State Diagrams Guide](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/about-state-diagrams/)
  - [Yahoo Finance API](https://financequotes-api.com/)
  - [JavaFX and Gradle Integration](https://openjfx.io/openjfx-docs/#gradle)
  - [Citi Job Simulations on Forage](https://www.theforage.com/show-firm-programs/8eNRcRqBZM9HLvwGw/Citi)
