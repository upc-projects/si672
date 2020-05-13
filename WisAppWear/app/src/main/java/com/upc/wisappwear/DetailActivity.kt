package com.upc.wisappwear

import android.os.Bundle
import android.os.PersistableBundle
import android.support.wearable.activity.WearableActivity
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.detail_activity.*


/**
 * Created by Enzo Lizama Paredes on 5/13/20.
 * Contact: lizama.enzo@gmail.com
 */
class DetailActivity : WearableActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        val data = intent.getStringExtra("data")
        val award = Gson().fromJson<Award>(data, Award::class.java)
        Log.d("artwork passed", award.toString())
        detail_name.text = award.title
        detail_date.text = award.date
        detail_contribution.text = award.contribution
        setAmbientEnabled()

    }
}