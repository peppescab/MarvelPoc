package ch.zu.peppescab.marvel.data

import ch.zu.peppescab.marvel.presentation.CharModel

interface CharsRepository {
    suspend fun getAllChars(): List<CharModel>
}