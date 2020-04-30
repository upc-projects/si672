package com.upc.pc1.moviles.model

import android.os.Bundle


/**
 * Created by Enzo Lizama Paredes on 4/25/20.
 * Contact: lizama.enzo@gmail.com
 */

data class ArtWork(
    val name: String,
    val description: String,
    val artist: Artist,
    val image: String? = ""
){
    companion object {
        fun fromBundle(bundle: Bundle) = Artist(
            bundle.getString("name")!!,
            bundle.getString("description")!!,
            bundle.getString("image")
        )
    }

    fun toBundle(): Bundle {
        val bundle = Bundle()
        with(bundle) {
            putString("name", name)
            putString("biography", description)
            putString("image", image)
        }
        return bundle
    }
}