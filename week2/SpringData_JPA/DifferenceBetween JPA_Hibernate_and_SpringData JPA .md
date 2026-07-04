#### **Difference between JPA, Hibernate, and Spring Data JPA**



###### **Java Persistence API (JPA):**

&#x09;

* JPA (Java Persistence API) is a Java specification that makes it easier to work with relational databases. It provides a specification for persisting, reading, and managing data from your Java object to relational tables in the database.
* JPA map Java classes (entities) to database tables and manage data using simple APIs instead of writing complex SQL. JPA acts as a bridge between Java objects and database records, simplifying database operations in Java applications.
* Defines annotations such as:	@Entity,@Table,@Id,@OneToMany,@ManyToOne



###### **Hibernate:**

* Hibernate is an object-relational mapping solution for Java environments. Object-relational mapping or ORM is the programming technique to map application domain model objects to the relational database tables. 
* It implementation of the Java Persistence API that makes it a great choice as an ORM tool with the benefits of loose coupling. Converts Java objects into database tables and vice versa.

**Responsibilities**

* Implements JPA specification.
* Performs CRUD operations.
* Generates SQL automatically.
* Manages Sessions.
* Handles Transactions.
* Supports caching.
* Supports lazy loading.

Drawbacks:Lots of boilerplate code.



###### **Spring Data JPA:**

* Spring Data JPA is a Spring Framework module that simplifies database access. It does not implement JPA.Instead, it sits on top of Hibernate. The goal of Spring Data repository abstraction is to significantly reduce the amount of boilerplate code required to implement data access layers for various persistence stores.

**Responsibilities**

* Automatically implements repository methods.
* Manages transactions.
* Generates SQL.
* Eliminates Session handling.
* Reduces code significantly.





|**JPA**|**Hibernate**|**Spring Data JPA**|
|-|-|-|
|Specification|JPA implementation (ORM framework)|Spring abstraction over JPA|
|Defines persistence rules|Executes ORM operations|Simplifies database access|
|No implementation|Concrete implementation|Uses Hibernate internally|
|No CRUD methods|Manual CRUD with Session API|CRUD via JpaRepository|
|No transaction management|Manual transactions|Automatic transactions (@Transactional)|





**Conclusion :** JPA defines what persistence should do, Hibernate provides how it is done, and Spring Data JPA makes using Hibernate much simpler by reducing boilerplate code.

