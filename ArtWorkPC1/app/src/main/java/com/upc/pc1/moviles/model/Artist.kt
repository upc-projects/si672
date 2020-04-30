package com.upc.pc1.moviles.model

import android.os.Bundle


/**
 * Created by Enzo Lizama Paredes on 4/25/20.
 * Contact: lizama.enzo@gmail.com
 */

data class Artist(
    val name: String,
    val biography: String,
    val image: String? = ""
) {
    companion object {
        fun fromBundle(bundle: Bundle) = Artist(
            bundle.getString("name")!!,
            bundle.getString("biography")!!,
            bundle.getString("image")
        )
    }

    fun toBundle(): Bundle {
        val bundle = Bundle()
        with(bundle) {
            putString("name", name)
            putString("biography", biography)
            putString("image", image)
        }
        return bundle
    }
}