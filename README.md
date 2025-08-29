# maven-springboot-template
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

  
