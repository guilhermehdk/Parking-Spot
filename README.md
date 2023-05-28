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

      (bash)
      > git clone https://github.com/your-username/parking-management-system.git

2. Open the project in your preferred Integrated Development Environment (IDE).

3. Configure the MySQL database connection properties in the application.properties file, providing the necessary credentials and connection details:
    - **DB_URL**: Database URL;
    - **DB_USER**: Database username;
    - **DB_PASSWORD**: Database password.

4. Build the project and resolve any dependencies using your build tool (Maven).

5. Run the application, and it will start on the specified port (default is 8080).

6. Access the application in your API testing tool (Postman or similar) by navigating to http://localhost:8080.

# Usage

Once the application is up and running, you can access the various CRUD operations with Postman. Here's a brief guide on how to use the system:

###### I will be making updates in the future to implement a frontend that will enable the execution of CRUD operations through the user interface.

### 1. Create a new parking spot:
      
- HTTP method: **POST**
- URL: http://localhost:8080/parking-spot
- Body:

    It must have all fields of the parking space data:

    - parkingSpotNumber
    - licensePlateCar
    - brandCar
    - modelCar
    - colorCar
    - responsibleName
    - apartment
    - block

          {
          "parkingSpotNumber": "602B",
          "licensePlateCar": "ABC4321",
          "brandCar": "Toyota",
          "modelCar": "Corolla",
          "colorCar": "silver",
          "responsibleName": "John",
          "apartment": "602",
          "block": "B"
          }

- The expected return is:
    - HTTP response status code: **201 (CREATED)**
    - ID and parking spot information.

![1-Create](https://github.com/guilhermehdk/assets/blob/main/parking-spot/1-Create.png)

2. View existing parking spot:
    - HTTP method: **GET**
    - URL: http://localhost:8080/parking-spot
            
    The expected return is:
    - HTTP response status code: **200 (OK)**
    - All parking spaces registered in the database and their data.

![3-FindAll](https://github.com/guilhermehdk/assets/blob/main/parking-spot/3-FindAll.png)

3. View existing parking spot by page:
    - HTTP method: **GET**
    - URL: http://localhost:8080/parking-spot?page=1&size=5&sort=parkingSpotNumber,DESC
            
    The expected return is:
    - HTTP response status code: **200 (OK)**
    - All parking spaces registered in the database and their data.

![4-FindAllPage](https://github.com/guilhermehdk/assets/blob/main/parking-spot/4-FindAllPage.png)

4. Find parking spot by ID:
    - HTTP method: **GET**
    - URL: http://localhost:8080/parking-spot/ca331c7e-c3e2-4e72-9609-919ee91a495a
            
    The expected return is:
    - HTTP response status code: **200 (OK)**
    - Data of the respective parking spot.

![5-FindById](https://github.com/guilhermehdk/assets/blob/main/parking-spot/5-FindById.png)

5. Update a parking spot:
    - HTTP method: **PUT**
    - URL: http://localhost:8080/{id}

       where **{id}** is the ID of the parking spot
       for example: http://localhost:8080/parking-spot/ca331c7e-c3e2-4e72-9609-919ee91a495a
    - Body:

      It should include one or more fields of the parking space data:

      - parkingSpotNumber
      - licensePlateCar
      - brandCar
      - modelCar
      - colorCar
      - responsibleName
      - apartment
      - block

            {
            "parkingSpotNumber": "602D"
            }
            
            
    The expected return is:
    - HTTP response status code: **200 (OK)**
    - ID and parking spot information.

![2-Update](https://github.com/guilhermehdk/assets/blob/main/parking-spot/2-Update.png)

6. Delete a parking spot:
 
    - HTTP method: **DELETE**
    - URL: http://localhost:8080/{id}

       where **{id}** is the ID of the parking spot
       for example: http://localhost:8080/parking-spot/ca331c7e-c3e2-4e72-9609-919ee91a495a
            
    The expected return is:
    - HTTP response status code: **204 (NO CONTENT)**

![6-Delete](https://github.com/guilhermehdk/assets/blob/main/parking-spot/6-Delete.png)


# Contributing
Contributions to the Parking Management System project are welcome. If you have any ideas, suggestions, or bug reports, please submit them via GitHub issues. You can also fork the repository, make the desired changes, and submit a pull request.




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