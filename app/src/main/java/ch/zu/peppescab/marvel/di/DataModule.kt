package ch.zu.peppescab.marvel.di

import ch.zu.peppescab.marvel.data.CharsRepository
import ch.zu.peppescab.marvel.data.CharsRepositoryImpl
import ch.zu.peppescab.marvel.data.network.CharsRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideCharsRepository(charsRemoteDataSource: CharsRemoteDataSource): CharsRepository =
        CharsRepositoryImpl(charsRemoteDataSource)
}