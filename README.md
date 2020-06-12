# Building a Kotlin based GraphQL server using Spring boot and graphql-kotlin library
This example helps you in setting up a kotlin based graphql server using [graphql-kotlin](https://github.com/ExpediaGroup/graphql-kotlin).

## Pre-requisite

1. Install IntelliJ
2. Have basic understanding of [Kotlin](https://kotlinlang.org/)
3. Have basic understanding of [GraphQL](https://graphql.org/)

# Get the basic server up
In the following exercise we will try to bring the basic graphql server up. 

## 1. Creating basic Kotlin/JVM project in IntelliJ

## 2. Add dependencies 

```java
implementation("com.expediagroup", "graphql-kotlin-spring-server", "3.1.1")
```

### Why are we using graphql-kotlin library?

## 3. Add Configuration

```kotlin
# file application.yml
graphql:
  packages: "com.sashwat.project.entity"
  subscriptions:
    # Send a ka message every 1000 ms (1 second)
    keepAliveInterval: 1000
```

## 4. Add a Simple Query

```kotlin
package com.sashwat.project.entity.query

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component


@Component
class SimpleQuery: Query {
    fun helloWorld() = "hello World!"
}
```

## 5. Add Application Server

```kotlin
package com.sashwat.project.entity

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application 

fun main(args: Array<String>) {
    runApplication<Application>(*args);
}
```



 