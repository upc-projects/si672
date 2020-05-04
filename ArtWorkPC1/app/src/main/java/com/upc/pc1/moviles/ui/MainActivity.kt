package com.upc.pc1.moviles.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import com.upc.pc1.moviles.R
import com.upc.pc1.moviles.data.artWorkList
import com.upc.pc1.moviles.model.ArtWork
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ArtItemCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        artWorkRecyclerView.apply {
            adapter = ArtWorkAdapter(
                applicationContext,
                artWorkList,
                this@MainActivity
            )
            layoutManager = GridLayoutManager(applicationContext, 2)
        }

    }

    override fun goToArtDetailPage(artWork: ArtWork) {
        val intent = Intent(this, DetailArtWorkActivity::class.java)
        val artworkData = Gson().toJson(artWork)
        intent.putExtra("data", artworkData)
        startActivity(intent)
    }
}
