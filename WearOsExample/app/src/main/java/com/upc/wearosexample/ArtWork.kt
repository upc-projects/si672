package com.upc.wearosexample

data class ArtWork(
    val name: String,
    val description: String,
    val image: String? = ""
)

val list = listOf(
    ArtWork(
        name = "Pintura #1",
        description = "Lorem ipsum",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg"
    ),
    ArtWork(
        name = "Pintura #1",
        description = "Lorem ipsum",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg"
    ),
    ArtWork(
        name = "Pintura #1",
        description = "Lorem ipsum",
        image = "https://d32dm0rphc51dk.cloudfront.net/LhDFSf2s-ufZjCLNJa0Crg/large.jpg"
    )
)