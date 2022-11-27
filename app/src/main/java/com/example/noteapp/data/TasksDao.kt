package com.example.noteapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TasksDao {
    @Query("SELECT * FROM Tasks")
    fun getAll(): Flow<List<TaskEntity>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(users: TaskEntity)

    @Delete
    fun delete(user: TaskEntity)

    @Query("DELETE FROM Tasks")
    fun deleteAll()

}