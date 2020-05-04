package com.upc.pc1.moviles.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.upc.pc1.moviles.R
import com.upc.pc1.moviles.model.ArtWork
import kotlinx.android.synthetic.main.activity_detail_art_work.*

class DetailArtWorkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_art_work)
        val data = intent.getStringExtra("data")
        val artwork = Gson().fromJson<ArtWork>(data, ArtWork::class.java)
        Log.d("artwork passed", artwork.toString())
        tv_author.text = artwork.artist.name
        tv_name.text = artwork.name
        tv_description.text = artwork.description
        Glide.with(this).load(artwork.image).into(imageViewArtwork)
        Glide.with(this).load(artwork.artist.image).into(imageViewAuthor)
    }
}
