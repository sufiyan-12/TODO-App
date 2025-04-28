package com.modern.todoapp.persistence.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {

    @Query("SELECT * FROM todos")
    suspend fun getAllTodos(): List<TodoModel>

    @Query("SELECT * FROM todos WHERE id = :id")
    suspend fun getTodoById(id: Int): TodoModel?

    @Insert
    suspend fun createTodo(todo: TodoModel)

    @Update
    suspend fun updateTodo(todo: TodoModel)

    @Query("DELETE FROM todos WHERE id = :id")
    suspend fun deleteTodo(id: Int)

    @Query("DELETE FROM todos")
    suspend fun deleteAllTodos()
}