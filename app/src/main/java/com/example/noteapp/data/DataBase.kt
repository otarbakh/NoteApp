package com.example.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 8)

abstract class DataBase: RoomDatabase() {
    abstract val teamsDao: TasksDao

}