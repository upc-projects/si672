package com.upc.pc1.moviles.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.upc.pc1.moviles.R
import com.upc.pc1.moviles.data.artWorkList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        artWorkRecyclerView.apply {
            adapter = ArtWorkAdapter(
                applicationContext,
                artWorkList
            )
            layoutManager = GridLayoutManager(applicationContext, 2)
        }
    }
}
