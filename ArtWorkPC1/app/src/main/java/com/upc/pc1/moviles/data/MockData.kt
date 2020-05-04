package com.upc.pc1.moviles.data

import com.upc.pc1.moviles.model.ArtWork
import com.upc.pc1.moviles.model.Artist


/**
 * Created by Enzo Lizama Paredes on 4/25/20.
 * Contact: lizama.enzo@gmail.com
 */

val artWorkList = listOf<ArtWork>(
    ArtWork(
        name = "Pintura #1",
        description = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg",
        artist = Artist(
            name = "Pablo Picasso",
            biography = "Pablo Ruiz Picasso was a Spanish painter, sculptor, printmaker, ceramicist and theatre designer who spent most of his adult life in France.",
            image = "https://cdn.aarp.net/content/dam/aarp/entertainment/art_music/2019/01/1140-1-pablo-picasso-esp.web.jpg"
        )
    ),
    ArtWork(
        name = "Pintura #2",
        description = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg",
        artist = Artist(
            name = "Pablo Picasso",
            biography = "Pablo Ruiz Picasso was a Spanish painter, sculptor, printmaker, ceramicist and theatre designer who spent most of his adult life in France.",
            image = "https://cdn.aarp.net/content/dam/aarp/entertainment/art_music/2019/01/1140-1-pablo-picasso-esp.web.jpg"
        )
    )
)