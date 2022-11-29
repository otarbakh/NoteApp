package com.example.noteapp.data.repositoryImplementation

import com.example.noteapp.data.TaskEntity
import com.example.noteapp.data.TasksDao
import com.example.noteapp.domain.TasksRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TasksRepositoryImplementation @Inject constructor(
    private val tasksDao: TasksDao
):TasksRepository {
    override fun getTasks(): Flow<List<TaskEntity>> {
        return tasksDao.getAll()
    }

    override suspend fun insertTask(task: TaskEntity) {
        return tasksDao.insert(task)
    }

    override suspend fun deleteTask(task: TaskEntity) {
        return tasksDao.delete(task)
    }

    override suspend fun deleteAll() {
        return tasksDao.deleteAll()
    }

    override suspend fun update(task: TaskEntity) {
        return tasksDao.update(task)
    }


}