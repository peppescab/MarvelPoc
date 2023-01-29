package ch.zu.peppescab.marvel.presentation

import ch.zu.peppescab.marvel.data.network.Constants.IMAGE_BASE_URL

data class CharModel(val name: String, val id: Int,val urlThumb:String) {
    fun getImgUri() = String.format(IMAGE_BASE_URL, id)
}