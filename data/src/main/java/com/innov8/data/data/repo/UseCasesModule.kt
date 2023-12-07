package com.innov8.data.data.repo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {


    @Singleton
    @Provides
    fun provideUseCase(
        repository: MatchesRepository
    ) = MatchesUseCases(repository)

}