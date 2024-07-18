# Project: my_marvin

## Overview

This project aims to automate everyday developer tasks using Jenkins, focusing on Continuous Integration (CI) and Continuous Delivery (CD). It leverages Jenkins' capabilities to streamline the software development lifecycle through automation.

## Technical Requirements

### Configuration as Code (JCasC)

The entire Jenkins configuration is described in a YAML file named `my_marvin.yml` located at the root of this repository. This approach, known as Configuration as Code, ensures that the Jenkins setup can be reproduced consistently.

### Job DSL

Job Domain Specific Language (Job DSL) is utilized to define Jenkins jobs programmatically. All DSL scripts are centralized into a single `job_dsl.groovy` file located at the root of the repository. This file is crucial for defining and managing Jenkins jobs in an automated manner.

### Automated Testing

The project is entirely evaluated through Automated Tests. This includes testing the configuration and functionality of Jenkins using an automation platform, ensuring robustness and reliability.

## Additional Information

### Jenkins Automation

Jenkins serves as the core automation platform for this project, enabling tasks ranging from simple cleanups to complex, production-scaled deployments. The CI/CD pipeline established here is essential for integrating and delivering changes swiftly and reliably.

### Project Evaluation

Evaluation criteria include adherence to YAML and DSL specifications, avoidance of hardcoding passwords, and seamless integration with environment variables. Failure to comply with these requirements will result in project failure.

## Conclusion

By mastering Jenkins for automation, this project demonstrates effective DevOps practices, enhancing productivity and reliability in software development.
