package ch.zu.peppescab.marvel.data.dto

import ch.zu.peppescab.marvel.presentation.CharModel

data class Result(
    val comics: Comics,
    val description: String,
    val events: Events,
    val id: Int,
    val modified: String,
    val name: String,
    val resourceURI: String,
    val series: Series,
    val stories: Stories,
    val thumbnail: Thumbnail,
    val urls: List<Url>
)

fun Result.toCharModel() = CharModel(
    this.name, this.id
)