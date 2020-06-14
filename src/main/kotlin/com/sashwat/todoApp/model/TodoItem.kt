package com.sashwat.todoApp.model

import com.expediagroup.graphql.annotations.GraphQLDescription

@GraphQLDescription("Type for TodoItem")
data class TodoItem(
    val _id: Long,
    val details: String,
    val status: String
)