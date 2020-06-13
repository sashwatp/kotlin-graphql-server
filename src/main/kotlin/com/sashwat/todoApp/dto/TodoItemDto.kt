package com.sashwat.todoApp.dto

import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters.eq
import com.sashwat.todoApp.model.TodoItem
import org.bson.codecs.configuration.CodecRegistries.fromProviders
import org.bson.codecs.configuration.CodecRegistries.fromRegistries
import org.bson.codecs.configuration.CodecRegistry
import org.bson.codecs.pojo.PojoCodecProvider
import org.springframework.stereotype.Component

@Component
class TodoItemDto() {

    private val mongoClient: MongoClient

    init {
        val codecRegistry: CodecRegistry = fromRegistries(
            MongoClientSettings.getDefaultCodecRegistry(),
            fromProviders(
                PojoCodecProvider.builder()
                    .automatic(true)
                    .build()
            )
        )
        val settings: MongoClientSettings = MongoClientSettings.builder()
            .codecRegistry(codecRegistry)
            .build()
        mongoClient = MongoClients.create(settings)
    }


    fun insert(todoItem: TodoItem) {
        getCollection().insertOne(todoItem)
    }

    fun getTodoItem(id: Long): TodoItem? {
        return getCollection().find(eq("id", id))
            .first()
    }

    fun getTodoItemList(): List<TodoItem> {
        return getCollection().find()
            .toList()
    }


    private fun getCollection(): MongoCollection<TodoItem> {
        val database: MongoDatabase = mongoClient.getDatabase("TodoItemsDB")

        return database.getCollection("todoItem", TodoItem::class.java)
    }
}