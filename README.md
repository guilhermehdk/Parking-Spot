# Project Name: Parking Management System
This README provides an overview of the Parking Management System, a CRUD (Create, Read, Update, Delete) application developed in Java using the Spring Boot framework, Hibernate, JPA (Java Persistence API), and MySQL. The system aims to facilitate the management of parking spaces in an apartment building.

# Features
- Create: Users can add new parking spaces to the system, specifying relevant information such as the apartment number, owner's name, and vehicle details.
- Read: The system allows users to view a list of all parking spaces in the apartment building, including details such as the owner's name, apartment number, and vehicle information.
- Update: Users have the ability to update the information associated with a parking space, such as the owner's name, vehicle details, or availability status.
- Delete: Users can delete a parking space from the system if it is no longer required or becomes unavailable.

# Technologies Used
- Java: The core programming language used for developing the application logic.
- Spring Boot: A Java framework that simplifies the development of standalone, production-grade Spring-based applications.
- Hibernate: An Object-Relational Mapping (ORM) framework that provides a mapping between Java objects and a relational database (MySQL in this case).
- JPA: Java Persistence API is a specification that allows developers to manage relational data in Java applications.
- MySQL: A widely used open-source relational database management system.

# Getting Started
To run the Parking Management System locally on your machine, follow these steps:

1. Clone the repository to your local machine using the following command:
  > bash
  >> git clone https://github.com/your-username/parking-management-system.git

1. Open the project in your preferred Integrated Development Environment (IDE).

1. Configure the MySQL database connection properties in the application.properties file, providing the necessary credentials and connection details.

1. Build the project and resolve any dependencies using your build tool (e.g., Maven or Gradle).

1. Run the application, and it will start on the specified port (default is 8080).

1. Access the application in your web browser by navigating to http://localhost:8080.

# Usage
Once the application is up and running, you can access the various CRUD operations through the user interface. Here's a brief guide on how to use the system:

Create a new parking space:

Click on the "Add Parking Space" button.
Fill in the required details, such as the owner's name, apartment number, and vehicle information.
Click "Save" to add the parking space to the system.
View existing parking spaces:

The main dashboard will display a list of all parking spaces in the apartment building.
Each entry will include details such as the owner's name, apartment number, and vehicle information.
Update a parking space:

Find the parking space you wish to update in the list.
Click on the "Edit" button next to the corresponding entry.
Update the relevant information.
Click "Save" to apply the changes.
Delete a parking space:

Locate the parking space you want to remove.
Click on the "Delete" button next to the corresponding entry.
Confirm the deletion when prompted.
Contributing
Contributions to the Parking Management System project are welcome. If you have any ideas, suggestions, or bug reports, please submit them via GitHub issues. You can also fork the repository, make the desired changes, and submit a pull request.

License
This project is licensed under the MIT License. Feel free to use and modify the code as per your needs

# Big Game Survey 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

https://wmazoni-sds1.netlify.app

Big Game Survey é uma aplicação full stack web e mobile construída durante a 1ª edição da **Semana DevSuperior** (#sds1), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma pesquisa de preferência de games, onde os dados são coletados no app mobile, e depois são listados no app web, que também apresenta um dashboard com gráficos baseados nestes dados.

## Layout mobile
![Mobile 1](https://github.com/acenelio/assets/raw/main/sds1/mobile1.png) ![Mobile 2](https://github.com/acenelio/assets/raw/main/sds1/mobile2.png)

## Layout web
![Web 1](https://github.com/acenelio/assets/raw/main/sds1/web1.png)

![Web 2](https://github.com/acenelio/assets/raw/main/sds1/web2.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/acenelio/assets/raw/main/sds1/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Wellington Mazoni de Andrade

https://www.linkedin.com/in/wmazoni
