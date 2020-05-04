package com.upc.pc1.moviles.ui

import com.upc.pc1.moviles.model.ArtWork


/**
 * Created by Enzo Lizama Paredes on 5/4/20.
 * Contact: lizama.enzo@gmail.com
 */
interface ArtItemCallback {
    fun goToArtDetailPage(artWork: ArtWork)
}