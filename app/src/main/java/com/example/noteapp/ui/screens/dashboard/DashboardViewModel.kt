package com.example.noteapp.ui.screens.dashboard

import androidx.lifecycle.ViewModel
import com.example.noteapp.data.TaskEntity
import com.example.noteapp.data.repositoryImplementation.TasksRepositoryImplementation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val tasksRepo: TasksRepositoryImplementation,
) : ViewModel() {
    suspend fun getTasks(): Flow<List<TaskEntity>> {
        return tasksRepo.getTasks()
    }
    fun delete(task: TaskEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            tasksRepo.deleteTask(task)
        }
    }
}