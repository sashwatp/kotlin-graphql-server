package com.sashwat.todoApp.model

import com.expediagroup.graphql.annotations.GraphQLDescription

@GraphQLDescription("Type for Status")
enum class Status (val value: String) {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE")
}