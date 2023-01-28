package ch.zu.peppescab.marvel.data

import ch.zu.peppescab.marvel.data.dto.toCharModel
import ch.zu.peppescab.marvel.data.network.CharsRemoteDataSource
import javax.inject.Inject

class CharsRepositoryImpl @Inject constructor(private val charsRemoteDataSource: CharsRemoteDataSource) :
    CharsRepository {
    override suspend fun getAllChars() =
        charsRemoteDataSource.getAllChars().data.results.map {
            it.toCharModel()
        }
}