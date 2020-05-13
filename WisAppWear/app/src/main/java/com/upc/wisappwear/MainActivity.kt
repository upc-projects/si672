package com.upc.wisappwear

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import androidx.wear.widget.WearableLinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity(), WisItemCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        werableRecyclerView.apply {
            isEdgeItemsCenteringEnabled = true
            layoutManager = WearableLinearLayoutManager(this@MainActivity)
            adapter = WisAdapter(applicationContext, mockData, this@MainActivity)
        }

        // Enables Always-on
        setAmbientEnabled()
    }

    override fun goToAwardDetailPage(award: Award) {
        val intent = Intent(this, DetailActivity::class.java)
        val data = Gson().toJson(award)
        intent.putExtra("data", data)
        startActivity(intent)
    }
}
