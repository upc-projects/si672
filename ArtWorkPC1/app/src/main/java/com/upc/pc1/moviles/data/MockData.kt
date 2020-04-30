package com.upc.pc1.moviles.data

import com.upc.pc1.moviles.model.ArtWork
import com.upc.pc1.moviles.model.Artist


/**
 * Created by Enzo Lizama Paredes on 4/25/20.
 * Contact: lizama.enzo@gmail.com
 */

val artWorkList = listOf<ArtWork>(
    ArtWork(
        name = "Andrecito",
        description = "wss",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg",
        artist = Artist(
            name = "Rotrigo",
            biography = "Para llorando"
        )
    ),
    ArtWork(
        name = "Andrecito2",
        description = "wd",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg",
        artist = Artist(
            name = "Rotrigo",
            biography = "Para codeando"
        )
    )
)