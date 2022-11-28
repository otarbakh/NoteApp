package com.example.noteapp.di

import com.example.noteapp.data.repositoryImplementation.TasksRepositoryImplementation
import com.example.noteapp.domain.TasksRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun provideTasksRepo(repoImpl: TasksRepositoryImplementation): TasksRepository
}