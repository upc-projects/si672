package com.upc.parcialmoviles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.upc.parcialmoviles.data.mockAuthor
import com.upc.parcialmoviles.model.Award
import kotlinx.android.synthetic.main.activity_award_detail.*

class AwardDetailActivity : AppCompatActivity(), WisItemCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_award_detail)
        val data = intent.getStringExtra("data")
        val award = Gson().fromJson<Award>(data, Award::class.java)
        Log.d("artwork passed", award.toString())
        detail_award_title.text = award.title
        detail_award_area.text = award.area
        detail_award_contribution.text = award.contribution
        detail_award_date.text = award.date
        Picasso.with(this).load(award.image).into(detail_award_image)
        detail_award_scientific.setOnClickListener {
            goToScientificDetailPage()
        }
    }

    override fun goToAwardDetailPage(award: Award) {

    }

    override fun goToScientificDetailPage() {
        val intent = Intent(this, ScientificDetailActivity::class.java)
        val data = Gson().toJson(mockAuthor)
        intent.putExtra("data", data)
        startActivity(intent)
    }
}
