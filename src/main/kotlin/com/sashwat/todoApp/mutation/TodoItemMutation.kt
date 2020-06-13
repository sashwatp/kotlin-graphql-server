package com.sashwat.todoApp.mutation

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import com.sashwat.todoApp.dto.TodoItemDto
import com.sashwat.todoApp.model.TodoItem
import org.springframework.stereotype.Component

@GraphQLDescription("Mutatioon")
@Component
class TodoItemMutation : Mutation {
    private val todoItemDto: TodoItemDto = TodoItemDto()

    fun addTodoItem(todoItem: TodoItem): TodoItem {
        todoItemDto.insert(todoItem)
        return todoItem
    }
}