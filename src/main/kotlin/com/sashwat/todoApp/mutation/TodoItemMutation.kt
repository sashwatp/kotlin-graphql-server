package com.sashwat.todoApp.mutation

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import com.sashwat.todoApp.model.Status
import com.sashwat.todoApp.model.TodoItem
import org.springframework.stereotype.Component

@GraphQLDescription("Mutatioon")
@Component
class TodoItemMutation: Mutation {
    fun addTodoItem(todoItem: TodoItem) : TodoItem {
        return TodoItem(
            1L,
            "",
            Status.INACTIVE
        )
    }
}