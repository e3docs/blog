
# Full Stack Web Application with Next.js and Spring Boot

This repository provides a step-by-step guide on how to create a Full Stack Web Application using Next.js and Spring Boot. The project includes instructions for configuring Next.js as a static site with a Spring Boot backend, integrating Next.js and Spring Boot in a single app server, setting up proxy server settings in Next.js, and leveraging application plugins in a Spring Boot application.




## Versions

| Tools | Versions                       |
| :-------- | :-------------------------------- |
| Java      | `17` |
| Spring Boot      | `3.1.1` |
| Next.js      | `13.4.10` |
| Gradle      | `8.1.1` |
| Node      | `16.17.1` |
| npm      | `8.15.0` |
| React      | `18.2.0` |

## Frontend Setup for Next.js

- Create a Next.js App with the following command:
```bash
  npx create-next-app@latest
```
- Open the Next.js Project in your preferred code editor (e.g., VS Code).
- Update the package.json file to include the necessary dependencies.
- Modify the next.config.js file as needed for your project's configuration.
- Fetch data from the Backend and integrate it into your Next.js application.
- Modify the index.js file and add list mapping to display data from the backend.
- Create a new page to handle web app refresh and direct URL entry.
- Build and export the Next.js project for deployment.
## Backend Setup For Spring Boot
- Create a new project with Spring Initializr at https://start.spring.io/.
- Update the build.gradle file to include the necessary dependencies for your Spring Boot application.
- Build the project for Eclipse or your preferred IDE.
- Import the project into your IDE for further development.
- Create a controller class for handling API endpoints in your Spring Boot application.
- Create a filter component for integrating Next.js with the backend.
- Integrate the frontend (Next.js) with the backend (Spring Boot).
- Build the backend project to prepare for running the application.
- Run the application to see it in action.

For detailed step-by-step instructions and additional information, please refer this https://www.e3docs.com/blog/creating-a-full-stack-web-application-with-spring-boot-and-next-js/.