package com.sashwat.project.entity.query

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component


@Component
class SimpleQuery: Query {
    fun helloWorld() = "hello World!"
}