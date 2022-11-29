package com.example.noteapp.ui.screens.edit

import androidx.lifecycle.ViewModel
import com.example.noteapp.data.TaskEntity
import com.example.noteapp.data.repositoryImplementation.TasksRepositoryImplementation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditViewModel @Inject constructor(
    private val tasksRepo: TasksRepositoryImplementation,
) : ViewModel(){
    fun update(task: TaskEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            tasksRepo.update(task)
        }
    }
}