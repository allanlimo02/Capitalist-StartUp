SMEs Incubator 
----
SMEs incubator is an app that aims to support growing start-ups that have issues with funding.investors can post their details and view start-ups they can choose from their categories and the capital they need. On he other hand, StartUps can submit their names and categories. Categories can range from technology, e-commerce, agribusiness, health and transport.
## Contributors

* ALLAN LIMO - Scram Master
* ARON LANGAT
* KIBET KYLE
* CLINTON OMONDI
* SAMUEL KAMOTHO NJIIRU

## **Prerequisites**

You need the following installed on your machine
- java
- JDK - Java Development Kit
- Maven
- Gradle
- An IDE for Java
- Postgres DBMS
---
Clone this repository to your local machine to get Started:

```https://github.com/allanlimo02/Capitalist-StartUp.git```


---
## Installation
* Clone this project using ``` https://github.com/allanlimo02/Capitalist-StartUp.git```

After cloning to your local machine navigate to the folder you cloned into and open it with intellij.
* Navigate into the ``` src/main/java/App.java ``` and click run in intellij.
* Go to your browser and type ``` localhost:4567 ```
---
##Setting up database
private int id;
private String name;
private String name_of_startup;
private String category;
private int capital_Needed;

Use the  following commands to create database and tables
* ```psql```
  * ```CREATE DATABASE startup_mentorship;```
   * ``\c startup_mentorship``
   * ``CREATE TABLE startups (id serial PRIMARY KEY, name VARCHAR,name_of_startup VARCHAR,category VARCHAR,capital_Needed INTEGER)``
    * ````CREATE TABLE investors (id serial PRIMARY KEY, name VARCHAR,category VARCHAR)````
## Running the Tests

Create a test class for running tests in the application.

This is a sample test that tests if the object gets correctly instantiated:

```
  @Test
    public void startUpsInstantiatesCorrectly() {
        StartUps testStartUps = new StartUps("Elon","SpaceX", "Exploration", 7000);
        assertEquals(true, testStartUps instanceof StartUps);

    }
```
---
## Built With

* [Java](https://www.java.com/) [Spark]() - The language used
* [Intellij Idea](https://www.jetbrains.com/idea/) - Intergated development
* [Postgres Database](https://www.postgresql.org/)
---

## Contributing
-Contact us for any future collaborations.
 
   
    *Scram Master:
    * Allanlimo02@gmail.com
    * 0726 832 007
---
## License
This project comes with [MIT Licensing](./Licence).