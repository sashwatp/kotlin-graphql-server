package com.sashwat.project.entity.model

import com.expediagroup.graphql.annotations.GraphQLDescription

@GraphQLDescription("Book interface type")
data class Book(
    val id: String,
    val name: String
)