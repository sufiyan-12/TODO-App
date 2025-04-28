package com.modern.todoapp.repository

import com.modern.todoapp.persistence.room.TodoDao
import com.modern.todoapp.persistence.room.TodoModel
import javax.inject.Inject

class TodoRepositoryImpl @Inject
    constructor(private val todoDao: TodoDao): TodoRepository {

    override suspend fun getAllTodos(): List<TodoModel> {
        return todoDao.getAllTodos()
    }

    override suspend fun getTodoById(id: Int): TodoModel? {
        return todoDao.getTodoById(id)
    }

    override suspend fun insertTodo(todo: TodoModel) {
        todoDao.createTodo(todo)
    }

    override suspend fun deleteTodo(id: Int) {
        todoDao.deleteTodo(id)
    }

    override suspend fun deleteAllTodos() {
        todoDao.deleteAllTodos()
    }

    override suspend fun updateTodo(todo: TodoModel) {
        todoDao.updateTodo(todo)
    }
}