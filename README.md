# 1. Adding User Login or signup APIs
1.    /user:
    	post:
	      summary: Create user.
	      description: This can only be done by the logged in user.
	      operationId: createUser
2.   /user/createWithList:
	    post:
	      tags:
	        - user
	      summary: Creates list of users with given input array.
	      description: Creates list of users with given input array.
	      operationId: createUsersWithListInput
  3. /user/login:
	    get:
	      tags:
	        - user
	      summary: Logs user into the system.
	      description: Log into the system.
	      operationId: loginUser
4.  /user/logout:
	    get:
	      tags:
	        - user
	      summary: Logs out current logged in user session.
	      description: Log user out of the system.
	      operationId: logoutUser
5.  /user/{username}:
	    get:
	      tags:
	        - user
	      summary: Get user by user name.
	      description: Get user detail based on username.
	      operationId: getUserByName
6.  put:
      tags:
        - user
      summary: Update user resource.
      description: This can only be done by the logged in user.
      operationId: updateUser
7.  delete:
      tags:
        - user
      summary: Delete user resource.
      description: This can only be done by the logged in user.
      operationId: deleteUser

	


# copied from maven-springboot-template
This project will serve as a template for creating other mvn projects


While creating:

![image](https://github.com/user-attachments/assets/9cc31fdf-5dd4-4cc3-88f7-cd9ba8642513)

![image](https://github.com/user-attachments/assets/34fc972a-16d9-44c2-b879-0cc805ca0b2f)

Added:

<!-- core Micrometer dependency and a dependency for the specific monitoring 
			system you want to integrate with -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-registry-prometheus</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-tracing-bridge-brave</artifactId>
		</dependency>
		<dependency>
			<groupId>io.zipkin.reporter2</groupId>
			<artifactId>zipkin-reporter-brave</artifactId>
		</dependency>
<!-- Micrometer End -->

  
