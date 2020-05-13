package com.upc.parcialmoviles

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.upc.parcialmoviles.model.Scientist
import kotlinx.android.synthetic.main.activity_scientific_detail.*

class ScientificDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientific_detail)

        val data = intent.getStringExtra("data")
        val scientist = Gson().fromJson<Scientist>(data, Scientist::class.java)
        Log.d("artwork passed", scientist.toString())
        detail_scientific_contribution.text = scientist.biography
        detail_scientific_title.text = scientist.fullname
        Picasso.with(this).load(scientist.image).into(detail_scientific_image)
    }
}
