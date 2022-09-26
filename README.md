# Java Notes

## Important Links

* Core Java - Overview, First Java Program, Variables, Datatypes, Literals, Operators, Expressions and Conditional Statements.		https://www.geeksforgeeks.org/java-programming-basics/
* Core Java - String, Arrays, Looping Statements, Methods, Class, Object, static		https://www.programiz.com/java-programming
* Core Java - Access Modifiers, Packages, Encapsulation		https://www.javatpoint.com/inheritance-in-java
* Core Java - Polymorphism, Inheritance, Abstraction, Interface		https://www.geeksforgeeks.org/polymorphism-in-java/
* Core Java - Collection Framework, ArrayList, Map, Set.		https://www.geeksforgeeks.org/collections-in-java-2/
* Core Java - File Handling, Threads and Garbage Collections, Exception Handling, Enums.		https://www.javatpoint.com/java-io
* Java 8 - Java 8 Features - Lambda Expressions, Streams, Filters, java.time.		https://www.journaldev.com/2389/java-8-features-with-examples
* Junit 5 and Maven - Writing basic tests, Assert Statements, Testing Exceptions		https://howtodoinjava.com/junit-5-tutorial/
* RDBMS - DDL Commands, DML Commands		https://www.javatpoint.com/mysql-tutorial
* RDBMS - Operators, Aggregate, String, Date Functions		https://www.geeksforgeeks.org/sql-tutorial/
* Web Basics - Learn the basics of HTML5 & CSS3		https://www.w3schools.com/html/
* JavaScript - Learn the basics of Javascript		https://www.javatpoint.com/javascript-tutorial![image](https://user-images.githubusercontent.com/42864715/172369342-f5a11d3a-15fe-46da-9253-4ef28c976f30.png)


```text


Java -
Required softwares and tools -
----------------------------------
JDK - 11+
MySQL - 8
IDEs - Eclipse(Spring Tools IDE), Visual Studio Code
----------------------------------------------------
Java - 
 * Object Oriented
 * Dynamic
 * Platform Independent


JDK - Java Developmemt Kit
JRE - Java Runtime Environment
JVM - Java Virtual Machine

----------------------------------------
Basic building blocks in Java
-----------------------------------------
keywords,
identifiers
literals,
variables,
methods,
classes,
objects
---------------------------------------
Using variables in java:
-----------------------------
data-type variable-name;

Data-types
-------------------
Primary :
----------
byte - 1 byte integer value
short - 2 bytes integer value
int - 4 bytes
long - 8 bytes
float - 4 bytes (20.67F, -0.00054f)
double - 8 bytes (20.54630817)
char - 1 Byte / 2 Bytes ('a','-','5')
boolean - 1 Bit (true/false)

Secondary :
--------------
arrays
enum 

User defined types:
-------------------
class
interface


Java Naming Standard :
------------------------
Class naming rule :
----------------------
	Should always start with an Uppercase and follow the Camel casing
		- Scanner, BufferedReader

Variables/Method naming rule :
-------------------------------
	Should always start with a lowercase and follow the Camel casing
		- main(),username, nextInt()

Package naming rules :
-----------------------
	Should be in lowercase only

Final fields/constants :
--------------------------
	Should be in uppercase only

		final double PI=3.14;



```

## Assignments : Day1 

-- Complete the first four challenges --
https://www.hackerrank.com/domains/java

## Important Links

* Core Java - Overview, First Java Program, Variables, Datatypes, Literals, Operators, Expressions and Conditional Statements.		https://www.geeksforgeeks.org/java-programming-basics/
* Core Java - String, Arrays, Looping Statements, Methods, Class, Object, static		https://www.programiz.com/java-programming
* Core Java - Access Modifiers, Packages, Encapsulation		https://www.javatpoint.com/inheritance-in-java
* Core Java - Polymorphism, Inheritance, Abstraction, Interface		https://www.geeksforgeeks.org/polymorphism-in-java/
* Core Java - Collection Framework, ArrayList, Map, Set.		https://www.geeksforgeeks.org/collections-in-java-2/
* Core Java - File Handling, Threads and Garbage Collections, Exception Handling, Enums.		https://www.javatpoint.com/java-io
* Java 8 - Java 8 Features - Lambda Expressions, Streams, Filters, java.time.		https://www.journaldev.com/2389/java-8-features-with-examples
* Junit 5 and Maven - Writing basic tests, Assert Statements, Testing Exceptions		https://howtodoinjava.com/junit-5-tutorial/
* RDBMS - DDL Commands, DML Commands		https://www.javatpoint.com/mysql-tutorial
* RDBMS - Operators, Aggregate, String, Date Functions		https://www.geeksforgeeks.org/sql-tutorial/
* Web Basics - Learn the basics of HTML5 & CSS3		https://www.w3schools.com/html/
* JavaScript - Learn the basics of Javascript		https://www.javatpoint.com/javascript-tutorial![image](https://user-images.githubusercontent.com/42864715/172369342-f5a11d3a-15fe-46da-9253-4ef28c976f30.png)

```text

Object class methods :
-------------------------
String toString()
boolean equals()
int hashCode()


Collection Framework
-------------------------
Limitations of Arrays -

* Fixed size
* Items can not be removed
* Accessing through index only
* no well define algorithms are present

Collection Framework
--------------------
API - Application Programming Interface
Consists of different interfaces and classes


Layered Architecture
----------------------

Presentation Layer - For interactiong with clients

Business Layer - Business Logic and service classes

Persistence Layer - DAO (Data Access Object) contains storage logic

Database - Conatins the database


```

### Spring Framework

```text

Topic for today
---------------

Spring Core
Maven

JDBC
MySQL 

JUnit

Maven-
Build Tool
- Dependency Management
- Standard Project Structures


Dependency
------------
Laptop
Internet Connection


----------------
class Laptop{
	InternetConnection connection = new InternetConnection();
	public void joinMeeting(){
		connection.connect();
	}
}

class InternetConnection{
	public void connect(){
		System.out.println("Connected to Internet, Joining meeting");
	}
}		


class App{
	main(....){
		Laptop laptop = new Laptop();
		laptop.joinMeeting();
	}
}






Spring Dependency Injection
----------------------------

XML Approach
Annotation Approach
Java Approach


Dependency Injection
-----------------------
Setter Injection
Constructor Injection
Autowiring

Types of Autowiring
-------------------
byType
byName
byConstructor


Employee
	id : int
	empName : String
	skills: List<String>
	phone: Phone
	connectEmployee(){
		phone.call();
	}

Phone
	brand: String
     	sim:Sim
	call(){
		sim.call();
	}

Sim
	phoneNo:long
	call(){
	...
	}


Create 3 Employees having
	different Phones and Sims 
     
```
	
### Apache Maven Location

.m2/repository/javax/servlet/servlet-api



## Microservices
### coupon-service


### product-service


### order-service

```text

Service Registration :
----------------------
1. Created an Eureka-Server
2. Start the server on port 8761
3. Added eureka-client dependency to all the microservices
4. Added @EnableEurekaClient to all the services
5. Checked localhost:8761 on browser

Service Discovery :
--------------------

1. Add @LoadBalanced annotation to RestTemplate Bean (OrderService)
2. Replace the urls [localhost:xxxx] with the service names
e.g
COUPON_SERVICE_URL=http://COUPON-SERVICE/coupons/
PRODUCT_SERVICE_URL=http://PRODUCT-SERVICE/products/

```

## Dependencies for Circuit Breaker
------------------------------------

```xml

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

		<dependency>
			<groupId>io.github.resilience4j</groupId>
			<artifactId>resilience4j-spring-boot2</artifactId>
			<version>1.7.1</version>
		</dependency>
		
			<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
		</dependency>




```



















```
