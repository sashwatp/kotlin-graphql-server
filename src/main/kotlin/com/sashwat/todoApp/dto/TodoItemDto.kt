package com.sashwat.todoApp.dto


import com.sashwat.todoApp.model.TodoItem
import org.litote.kmongo.Id
import org.litote.kmongo.KMongo
import org.litote.kmongo.eq
import org.litote.kmongo.findOne

import org.springframework.stereotype.Component

@Component
class TodoItemDto() {

    private val client = KMongo.createClient()
    private val database = client.getDatabase("TodoItemsDB")
    private val collection = database.getCollection<TodoItem>("todoItem", TodoItem::class.java)

    fun insert(todoItem: TodoItem) {
        collection.insertOne(todoItem)
    }

    fun getTodoItem(id: Long): TodoItem? {
        return collection.findOne(TodoItem::_id eq id)
    }

    fun getTodoItemList(): List<TodoItem> {
        return collection.find()
            .toList()
    }
}