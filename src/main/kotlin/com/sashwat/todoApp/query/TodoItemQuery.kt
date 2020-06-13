package com.sashwat.todoApp.query

import com.expediagroup.graphql.spring.operations.Query
import com.sashwat.todoApp.model.Status
import com.sashwat.todoApp.model.TodoItem
import org.springframework.stereotype.Component

@Component
class TodoItemQuery: Query {
    fun todoItems(): List<TodoItem> {
        return listOf()
    }

    fun todoItem(id: Long) : TodoItem {
        return TodoItem(
            1L,
            "",
            Status.ACTIVE
        )
    }

}