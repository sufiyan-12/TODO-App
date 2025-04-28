package com.modern.todoapp.repository

import com.modern.todoapp.persistence.room.TodoModel

interface TodoRepository {

    suspend fun getAllTodos(): List<TodoModel>

    suspend fun getTodoById(id: Int): TodoModel?

    suspend fun insertTodo(todo: TodoModel)

    suspend fun deleteTodo(id: Int)

    suspend fun deleteAllTodos()

    suspend fun updateTodo(todo: TodoModel)
}