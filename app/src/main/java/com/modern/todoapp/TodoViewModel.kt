package com.modern.todoapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.modern.todoapp.persistence.room.TodoModel
import com.modern.todoapp.repository.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoViewModel @Inject
    constructor(private val repository: TodoRepository): ViewModel() {

        var todos by mutableStateOf<List<TodoModel>>(emptyList())
            private set

        init {
            loadTodos()
        }

    private fun loadTodos() {
        viewModelScope.launch {
            todos = repository.getAllTodos()
        }
    }

    fun addTodo(title: String) {
        viewModelScope.launch {
            repository.insertTodo(TodoModel(title = title))
            loadTodos()
        }
    }

    fun deleteTodo(todo: TodoModel) {
        viewModelScope.launch {
            repository.deleteTodo(todo.id)
            loadTodos()
        }
    }

    fun toggleTodo(todo: TodoModel) {
        viewModelScope.launch {
            repository.updateTodo(todo.copy(isCompleted = !todo.isCompleted))
            loadTodos()
        }
    }
}