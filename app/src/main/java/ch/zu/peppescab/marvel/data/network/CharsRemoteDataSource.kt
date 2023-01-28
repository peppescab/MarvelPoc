package ch.zu.peppescab.marvel.data.network

import ch.zu.peppescab.marvel.data.dto.MarvelResponse
import ch.zu.peppescab.marvel.data.network.SecretContainer.API_KEY
import ch.zu.peppescab.marvel.data.network.SecretContainer.HASH_100s
import retrofit2.http.GET
import retrofit2.http.Query


interface CharsRemoteDataSource {
    @GET("public/characters")
    suspend fun getAllChars(
        @Query("apikey") apikey: String = API_KEY,
        @Query("hash") hash: String = HASH_100s,
        @Query("ts") pageSize: Int = 100
    ): MarvelResponse
}