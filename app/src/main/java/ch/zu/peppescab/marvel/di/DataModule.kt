package ch.zu.peppescab.marvel.di

import ch.zu.peppescab.marvel.data.CharsRepository
import ch.zu.peppescab.marvel.data.CharsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    /**
     * Bind instead of provide if just an element in constructor
     * https://www.valueof.io/blog/inject-provides-binds-dependencies-dagger-hilt
     */
    @Singleton
    @Binds
    abstract fun bindCharsRepository(
        charsRepositoryImpl: CharsRepositoryImpl
    ): CharsRepository

}